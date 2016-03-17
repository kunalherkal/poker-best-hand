package com.github.kunalherkal

import com.github.kunalherkal.filters.FilterProcessor

/**
  * Created by Kunal Herkal on 3/15/16.
  */
object Main extends App {

  val deck = new Deck

  def getDeck : Deck = {
    if (deck != null) deck else new Deck
  }

  def bestHand(a : String, b :String, c : String, d :String, e : String): String = {
    val hand = Array(a, b, c, d, e)
    FilterProcessor.validate(hand, getDeck)

    val cards = hand.map(cardName => Deck.getCard(cardName, getDeck))
    BestPokerHand.resolve(cards)
  }

}
