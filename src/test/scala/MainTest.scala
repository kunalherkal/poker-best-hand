import com.github.kunalherkal.Main
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by Kunal Herkal on 3/17/16.
  */
class MainTest extends FlatSpec with Matchers {
  "best hand" should "be four of a kind" in {

    val bestHand = Main.findBestHand("H5", "D5", "S5", "HA", "C5")
    assert(bestHand == "four-of-a-kind")
  }

  "best hand" should "be full house" in {

    val bestHand = Main.findBestHand("H5", "D2", "D5", "H2", "C5")
    assert(bestHand == "full-house")
  }

  "best hand" should "be flush" in {

    val bestHand = Main.findBestHand("H5", "H2", "H3", "HK", "HT")
    assert(bestHand == "flush")
  }

  "best hand" should "be straight" in {

    val bestHand = Main.findBestHand("H5", "D2", "C3", "S6", "C4")
    assert(bestHand == "straight")
  }

  "best hand" should "not be straight and should be pair" in {

    val bestHand = Main.findBestHand("HA", "CA", "D2", "D3", "D4")
    assert(bestHand == "pair")
  }

  "best hand" should "not be straight and should be high card" in {

    val bestHand = Main.findBestHand("HA", "HK", "HQ", "H2", "C3")
    assert(bestHand == "high-card")
  }

  "best hand" should "be straight 2" in {

    val bestHand = Main.findBestHand("HA", "DK", "HQ", "HJ", "HT")
    assert(bestHand == "straight")
  }

  "best hand" should "be three of a kind" in {

    val bestHand = Main.findBestHand("H5", "D2", "D5", "S7", "C5")
    assert(bestHand == "three-of-a-kind")
  }

  "best hand" should "be pair" in {

    val bestHand = Main.findBestHand("H5", "D2", "H3", "S7", "C2")
    assert(bestHand == "pair")
  }

  "best hand" should "be High Card" in {

    val bestHand = Main.findBestHand("H5", "D2", "H3", "S7", "CT")
    assert(bestHand == "high-card")
  }

  "best hand" should "throw IllegalArgumentException for invalid cards" in {

    intercept[IllegalArgumentException] {
      Main.findBestHand("H5", "D2", "H0", "S7", "CT")
    }
  }

  "best hand" should "throw IllegalArgumentException for duplicate cards" in {

    intercept[IllegalArgumentException] {
      Main.findBestHand("H5", "D2", "H5", "S7", "CT")
    }
  }

}
