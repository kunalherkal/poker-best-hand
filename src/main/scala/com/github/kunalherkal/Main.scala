package com.github.kunalherkal

import com.github.kunalherkal.filters.FilterProcessor

/**
  * Created by Kunal Herkal on 3/15/16.
  */
object Main extends App {

  val deck = new Deck

  def getDeck : Deck = {
    //avoid null checks
    if (deck != null) deck else new Deck
  }

  def findBestHand(a : String, b :String, c : String, d :String, e : String): String = {
    val cardNames = Array(a, b, c, d, e)
    FilterProcessor.validate(cardNames, new Deck)
    val cards = cardNames.map(cardName => getDeck.getCard(cardName))
    val hand = new Hand(cards)
    hand.resolveBestPokerHand()
  }

}
