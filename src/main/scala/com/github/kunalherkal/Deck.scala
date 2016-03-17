package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
class Deck {

  val cards = (0 to 12).map(rank => Card(new SpadeSuit, rank)).toSet ++
    (0 to 12).map(rank => Card(new HeartSuit, rank)).toSet ++
    (0 to 12).map(rank => Card(new DiamondSuit, rank)).toSet ++
    (0 to 12).map(rank => Card(new ClubSuit, rank)).toSet

  def getCard(cardName : String) : Card = {
    cards.find(c => c.name == cardName).get
  }

  def cardExists(cardName: String) : Boolean = {
    if (cards.find(c => c.name == cardName).isEmpty) false else true
  }
}

