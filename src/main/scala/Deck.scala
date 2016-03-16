/**
  * Created by khn3193 on 3/15/16.
  */
class Deck {
  val spadeSuit = new SpadeSuit
  val heartSuit = new HeartSuit
  val diamondSuit = new DiamondSuit
  val clubSuit = new ClubSuit

  def allCards(): Set[Card] = {
    spadeSuit.cards ++ heartSuit.cards ++ diamondSuit.cards ++ clubSuit.cards
  }
}
