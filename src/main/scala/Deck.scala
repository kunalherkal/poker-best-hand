/**
  * Created by Kunal Herkal on 3/15/16.
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

object Deck {
  def getCard(cardName : String, deck : Deck) : Card = {
    deck.allCards().find(c => c.name == cardName).get
  }
}
