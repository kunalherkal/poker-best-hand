package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/16/16.
  */
class Card (val name: String, val rank: Int, val suit : Suit) {

  override def toString = s"Card(name=$name, rank=$rank)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Card]

  override def equals(other: Any): Boolean = other match {
    case that: Card =>
      (that canEqual this) &&
        name == that.name
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Card {
  def apply(suit : Suit, rank : Int): Card = rank match {
    case _ if rank < 8 => new Card(suit.identifier + (rank + 2).toString, rank, suit)
    case 8 => new Card(suit.identifier + "T", rank, suit)
    case 9 => new Card(suit.identifier + "J", rank, suit)
    case 10 => new Card(suit.identifier + "Q", rank, suit)
    case 11 => new Card(suit.identifier + "K", rank, suit)
    case 12 => new Card(suit.identifier + "A", rank, suit)
    case _ => throw new IllegalArgumentException
  }
}