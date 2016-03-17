package com.github.kunalherkal.filters

import com.github.kunalherkal.Deck

/**
  * Created by Kunal Herkal on 3/17/16.
  */
object FilterProcessor extends CardFilter {
  val filters : Set[CardFilter] = Set(DuplicateCardFilter, CardExistsFilter)

  override def validate(a: Array[String], deck: Deck): Unit = {
    filters.foreach(filter => filter.validate(a, deck))
  }
}
