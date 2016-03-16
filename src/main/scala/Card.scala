/**
  * Created by khn3193 on 3/16/16.
  */
class Card (val name: String, val rank: Int, val suitName : String){

  override def toString = s"Card(name=$name, rank=$rank)"
}

object Card {
  def createCards(suit : Suit, rank : Int): Card = rank match {
    case _ if rank < 8 => new Card(suit.identifier + (rank + 2).toString, rank, suit.name)
    case 8 => new Card(suit.identifier + "T", rank, suit.name)
    case 9 => new Card(suit.identifier + "J", rank, suit.name)
    case 10 => new Card(suit.identifier + "Q", rank, suit.name)
    case 11 => new Card(suit.identifier + "K", rank, suit.name)
    case 12 => new Card(suit.identifier + "A", rank, suit.name)
    case _ => throw new IllegalArgumentException
  }
}