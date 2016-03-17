package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
class HeartSuit extends Suit {
  val identifier = "H"
  val name = "Heart"
  val cards = this.cardsForSuit

  override def toString = s"HeartSuit(identifier=$identifier, cards=$cards)"
}
