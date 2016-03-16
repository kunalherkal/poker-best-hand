/**
  * Created by khn3193 on 3/15/16.
  */
trait Suit {
  def identifier : String
  def name : String
  def cards : Set[Card]

  def cardsForSuit(): Set[Card] = {
    (0 to 12).map(cost => Card.createCards(this, cost)).toSet
  }
}
