package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/15/16.
  */
trait Suit {
  def identifier : String
  def name : String
  def cards : Set[Card]

  def cardsForSuit(): Set[Card] = {
    (0 to 12).map(rank => Card(this, rank)).toSet
  }
}
