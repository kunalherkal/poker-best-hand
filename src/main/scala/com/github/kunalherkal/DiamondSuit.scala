package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
class DiamondSuit extends Suit {
  val identifier = "D"
  val name = "Diamond"
  val cards = this.cardsForSuit

  override def toString = s"DiamondSuit(identifier=$identifier, cards=$cards)"
}
