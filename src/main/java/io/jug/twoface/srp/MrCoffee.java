package io.jug.twoface.srp;

import io.jug.twoface.tail.Drink;
import io.jug.twoface.tail.Ingredient;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class MrCoffee {
  private List<Drink> drinks;
  private List<Ingredient> ingredients;

  public MrCoffee(Drink[] coffees, Ingredient[] ingredients) {
    this.drinks = List.of(coffees);
    this.ingredients = List.of(ingredients);
  }

  public boolean isAvailable(String coffee) {
    for (Drink d : this.drinks) {
      Map<String, Integer> currRecipe = d.getRecipe();
      for (Ingredient i : this.ingredients) {
        if (currRecipe.containsKey(i.getName()) && i.getStock() < currRecipe.get(i.getName())) {
          d.setMakeable(false);
          return false;
        }
        d.setMakeable(true);
      }
      return true;
    }
    return false;
  }
}
