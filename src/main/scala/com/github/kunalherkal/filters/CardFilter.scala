package com.github.kunalherkal.filters

import com.github.kunalherkal.Deck

/**
  * Created by Kunal Herkal on 3/17/16.
  */
trait CardFilter {
  def validate(a : Array[String], deck : Deck)
}
