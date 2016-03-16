/**
  * Created by khn3193 on 3/15/16.
  */
class HeartSuit extends Suit {
  val identifier = "H"
  val name = "Heart Suit"
  val cards = this.cardsForSuit

  override def toString = s"HeartSuit(identifier=$identifier, cards=$cards)"
}
