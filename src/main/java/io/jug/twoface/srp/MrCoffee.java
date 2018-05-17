package io.jug.twoface.srp;

import io.jug.twoface.tail.Drink;
import io.jug.twoface.tail.Ingredient;

import java.util.List;
import java.util.function.Predicate;

public class MrCoffee {
  private List<Drink> drinks;
  private List<Ingredient> ingredients;

  public MrCoffee(Drink[] coffees, Ingredient[] ingredients) {
    this.drinks = List.of(coffees);
    this.ingredients = List.of(ingredients);
  }

  public boolean hasAvailable(String drink) {
    return drinks.stream()
      .filter(it -> it.getName().equals(drink))
      .anyMatch(this::hasIngredients);
  }

  public boolean hasIngredients(Drink d) {
    d.setMakeable(ingredients.stream().anyMatch(isInStock(d)));
    return d.getMakeable();
  }

  public Predicate<Ingredient> isInStock(Drink d) {
    return it -> d.getRecipe().containsKey(it.getName()) && it.getStock() > d.getRecipe().get(it.getName());
  }
}
