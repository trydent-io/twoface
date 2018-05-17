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
  void shouldHave5Drinks() {
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
  void shouldHave3Alcoholics() {
    assertThat(
      new AlcoholicsOnly(
        Drinks.of(
          tassoni(),
          paleAle(),
          ipa(),
          freewayCola(),
          grog()
        )
      )
    ).hasSize(3);
  }

  @Test
  void shouldHaveBeers() {
    assertThat(
      new FilteredDrinks(
        IsBeer.and(IsAlcoholic),
        Drinks.of(
          tassoni(),
          paleAle(),
          ipa(),
          freewayCola(),
          grog(),
          corona()
        )
      )
    ).hasSize(2);
  }

  @Test
  @DisplayName("Drinks should not be modified")
  void shouldNotBeModified() {
    final Drink[] ds = {tassoni(), paleAle()};
    final var drinks = Drinks.of(ds);
    ds[0] = corona();

    assertThat(drinks).contains(tassoni());
  }
}