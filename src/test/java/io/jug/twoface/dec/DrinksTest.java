package io.jug.twoface.dec;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static io.jug.twoface.dec.Drink.corona;
import static io.jug.twoface.dec.Drink.freewayCola;
import static io.jug.twoface.dec.Drink.grog;
import static io.jug.twoface.dec.Drink.ipa;
import static io.jug.twoface.dec.Drink.paleAle;
import static io.jug.twoface.dec.Drink.tassoni;
import static io.jug.twoface.dec.DrinksExpressions.*;
import static io.jug.twoface.dec.DrinksExpressions.IsAlcoholic;

class DrinksTest {
  @Test
  @DisplayName("Drinks should not be modified")
  void shouldNotBeModified() {
    final Drink[] ds = {
      tassoni(),
      paleAle(),
      ipa(),
      freewayCola(),
      grog()
    };

    final var drinks = Drinks.of(ds);

    assertThat(drinks).contains(tassoni());
  }
}