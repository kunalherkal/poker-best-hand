/**
  * Created by khn3193 on 3/15/16.
  */
class DiamondSuit extends Suit {
  val identifier = "D"
  val name = "Diamond Suit"
  val cards = this.cardsForSuit

  override def toString = s"DiamondSuit(identifier=$identifier, cards=$cards)"
}
