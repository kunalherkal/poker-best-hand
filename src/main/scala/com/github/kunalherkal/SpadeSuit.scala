package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
class SpadeSuit extends Suit {
  val identifier = "S"
  val name = "Spade"
  val cards = this.cardsForSuit

  override def toString = s"SpadeSuit(identifier=$identifier, cards=$cards)"
}
