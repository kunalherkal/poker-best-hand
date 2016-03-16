/**
  * Created by khn3193 on 3/15/16.
  */
object Main extends App {

  val deck = new Deck
  println(deck.spadeSuit)
  println(deck.heartSuit)
  println(deck.diamondSuit)
  println(deck.clubSuit)

  def bestHand(a : String, b :String, c : String, d :String, e : String): String = {
    val handCards = Array(a, b, c, d, e)
    val cards = handCards.map(cardName => cardFromDeck(cardName, deck))
    BestPokerHandResolver.findBestHand(cards)
  }

  def cardFromDeck(cardName : String, deck : Deck) : Card = {
    deck.allCards().find(c => c.name == cardName) match {
      case a : Some[Card] => a.get
      case _  => throw new IllegalArgumentException("You entered wrong card: " + cardName)
    }
  }

  val output = bestHand("H2", "H9", "H5", "H6", "H7")
  val output2 = bestHand("H2", "D3", "H5", "H6", "H7")
  val output3 = bestHand("H2", "D2", "H5", "S2", "C2")
  val output4 = bestHand("H2", "D2", "D5", "S2", "H5")
  val output5 = bestHand("H2", "D2", "D5", "S3", "H5")
  val output6 = bestHand("H2", "D2", "D5", "S3", "S2")
  val output7 = bestHand("H6", "D3", "D4", "S5", "S2")
  val output8 = bestHand("HA", "D2", "D4", "S3", "S5")
  val output9 = bestHand("HA", "DJ", "DQ", "ST", "SK")
  val output10 = bestHand("HA", "D3", "D4", "S5", "S6")
  val output11 = bestHand("HA", "D3", "D4", "S5", "S2")
  val output12 = bestHand("HA", "D4", "D5", "S6", "S2")
  val output13 = bestHand("HA", "DA", "DQ", "SK", "SJ")
  val output14 = bestHand("HA", "D2", "D3", "SK", "SQ")

  println("Outputs: ")
  println(output == "Flush")
  println(output2 == "High Card")
  println(output3 == "Four of a Kind")
  println(output4 == "Full House")
  println(output5 == "Pair")
  println(output6 == "Three Of Kind")
  println(output7)
  println(output8)
  println(output9)
  println(output10)
  println(output11)
  println(output12)
  println(output13)
  println(output14)
}
