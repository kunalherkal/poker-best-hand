package com.github.kunalherkal

/**
  * Created by Kunal Herkal on 3/16/16.
  */
class Hand(val cards : Array[Card]) {

  require(cards.length == 5)

  def resolveBestPokerHand() : String = {
    if (isFourOfAKind) return "four-of-a-kind"
    if (isFullHouse)  return "full-house"
    if (isFlush) return "flush"
    if (isStraight) return "straight"
    if (isThreeOfAKind) return  "three-of-a-kind"
    if (isPair) return "pair"
    "high-card"
  }

  def isFlush : Boolean = {
    cards.map(card => card.suit.name).toSet.size == 1
  }

  def isFourOfAKind : Boolean = {
    rankRepetitions(cards)contains(4)
  }

  def isFullHouse : Boolean = {
    rankRepetitions(cards).contains(3) && rankRepetitions(cards).contains(2)
  }

  def isStraight : Boolean = {
    val ranks = cards.map(card => card.rank)
    ranks match {
      case sequence if inSequence(ranks) => true
      case hasAce if ranks.contains(12) => inSequenceWithAce(ranks)
      case _ => false
    }
  }

  def isThreeOfAKind : Boolean = {
    rankRepetitions(cards).contains(3)
  }

  def isPair : Boolean = {
    rankRepetitions(cards).contains(2)
  }

  private def inSequenceWithAce(list : Array[Int]) : Boolean = {
    val cardsExceptAce = list.filter(a => a != 12)
    cardsExceptAce.length == 4 && cardsExceptAce.contains(0) && inSequence(cardsExceptAce)
  }

  private def inSequence(ranks : Array[Int]) : Boolean = {

    def isInSequence(list : List[Int]) : Boolean = list match {
      case a :: Nil => true
      case head :: tail => ((head + 1) == tail.head) && isInSequence(tail)
      case Nil => throw new IllegalArgumentException
    }

    def isInSequenceWithFold(list : List[Int]) : Boolean = {
      val result : (Boolean, Int) = list.foldLeft((true, -1)) { (result, e) =>
        if(result._2 == -1) true -> e
        else (result._1 && ((result._2 + 1) == e)) -> e
      }

      result._1
    }

    isInSequence(ranks.toList.sorted)
  }

  private def rankRepetitions(a : Array[Card]) : Seq[Int] = {
    rankMap(a).values.toSeq
  }

  private def rankMap(a: Array[Card]): Map[Int, Int] = {
    a.map(card => card.rank).groupBy(identity).mapValues(_.length)
  }

}
