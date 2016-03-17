package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
class ClubSuit extends Suit {
  val identifier = "C"
  val name = "Club"
  val cards = this.cardsForSuit

  override def toString = s"ClubSuit(identifier=$identifier, cards=$cards)"
}
