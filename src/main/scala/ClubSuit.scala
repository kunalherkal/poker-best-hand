/**
  * Created by khn3193 on 3/15/16.
  */
class ClubSuit extends Suit {
  val identifier = "C"
  val name = "Club Suit"
  val cards = this.cardsForSuit

  override def toString = s"ClubSuit(identifier=$identifier, cards=$cards)"
}