/**
  * Created by khn3193 on 3/16/16.
  */
object BestPokerHandResolver {
  def findBestHand(a : Array[Card]) : String = () match {
    case fourOfKind if isFourOfAKind(a) => "Four of a Kind"
    case fullHouse if isFullHouse(a) => "Full House"
    case flush if isFlush(a) => "Flush"
    case straight if isStraight(a) => "Straight"
    case threeOfKind if isThreeOfAKind(a) => "Three Of Kind"
    case pair if isPair(a) => "Pair"
    case _ => "High Card"
  }

  def isFlush(a : Array[Card]) : Boolean = {
    a.map(card => card.suitName).groupBy(identity).mapValues(_.length).size == 1
  }

  def isFourOfAKind(a : Array[Card]) : Boolean = {
    rankRepetitions(a)contains(4)
  }

  def isFullHouse(a : Array[Card]) : Boolean = {
    rankRepetitions(a).contains(3) && rankRepetitions(a).contains(2)
  }

  def isStraight(a : Array[Card]) : Boolean = {
    val ranks = a.map(card => card.rank)
    ranks match {
      case b if isInSequence(ranks) => true
      case c if ranks.contains(12) => isInSequenceWithAce(ranks)
      case _ => false
    }
  }

  def isInSequenceWithAce(list : Array[Int]) : Boolean = {
    val newList = list.filter(a => a != 12)
    newList.length == 4 && newList.contains(0) && isInSequence(newList)

  }

  def isInSequence(list : Array[Int]) : Boolean = {
    val sorted = list.sorted
    val size = list.length - 2
    val list2 = (0 to size).map(index => {
      val i: Int = sorted(index)
      val j: Int = sorted(index + 1) - 1
      i == j })
    !list2.contains(false)
  }

  def isThreeOfAKind(a : Array[Card]) : Boolean = {
    rankRepetitions(a).contains(3)
  }

  def isPair(a : Array[Card]) : Boolean = {
    rankRepetitions(a).contains(2)
  }

  def rankRepetitions(a : Array[Card]) : Seq[Int] = {
    rankMap(a).values.toSeq
  }

  def rankMap(a: Array[Card]): Map[Int, Int] = {
    a.map(card => card.rank).groupBy(identity).mapValues(_.length)
  }

}
