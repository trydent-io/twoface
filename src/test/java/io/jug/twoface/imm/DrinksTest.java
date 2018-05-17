package io.jug.twoface.imm;


import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static io.jug.twoface.imm.Drink.freewayCola;
import static io.jug.twoface.imm.Drink.grog;
import static io.jug.twoface.imm.Drink.ipa;
import static io.jug.twoface.imm.Drink.paleAle;
import static io.jug.twoface.imm.Drink.tassoni;

class DrinksTest {
  @Test
  void shouldHaveDrinks() {
    assertThat(
      Drinks.of(
        tassoni(),
        paleAle(),
        ipa(),
        freewayCola(),
        grog()
      )
    ).hasSize(5);
  }

  @Test
  void shouldHaveBeers() {
    assertThat(
      new Beers(
        Drinks.of(
          tassoni(),
          paleAle(),
          ipa(),
          freewayCola(),
          grog()
        )
      )
    ).hasSize(2);
  }

}