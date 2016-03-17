package com.github.kunalherkal.filters

import com.github.kunalherkal.Deck

/**
  * Created by Kunal Herkal on 3/17/16.
  */
object DuplicateCardFilter extends CardFilter {
  override def validate(a: Array[String], deck: Deck): Unit = {
    if (a.toSet.size != 5) throw new IllegalArgumentException("You entered duplicate cards")
  }
}
