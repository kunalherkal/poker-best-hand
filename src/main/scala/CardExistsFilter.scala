/**
  * Created by Kunal Herkal on 3/17/16.
  */
object CardExistsFilter extends CardFilter {
  override def validate(a: Array[String], deck: Deck): Unit = {
    a.foreach(card => cardExists(card, deck))
  }

  def cardExists(cardName : String, deck : Deck) : Unit = {
    if (deck.allCards().find(c => c.name == cardName).isEmpty) throw new IllegalArgumentException("Card you entered is invalid: " + cardName)
  }
}
