package io.jug.twoface.srp;

import io.jug.twoface.tail.Drink;
import io.jug.twoface.tail.Ingredient;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class MrCoffeeTest {
  @Test
  void shouldHaveCoffee() {
    final String[] recipe = {"Coffee", "Sugar", "Water"};
    final Drink[] drinks = {
      new Drink("Coffee", recipe)
    };
    final Ingredient[] ingredients = {
      new Ingredient("Coffee", 0.5),
      new Ingredient("Sugar", 0.5),
      new Ingredient("Water", 0.1)
    };

    assertThat(
      new MrCoffee(drinks, ingredients).hasAvailable("Coffee")
    ).isTrue();
  }
}