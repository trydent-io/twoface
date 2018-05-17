package io.jug.twoface.dec;

import java.util.Iterator;
import java.util.function.Predicate;

import static io.jug.twoface.dec.Drink.Type.Beer;
import static java.util.stream.StreamSupport.stream;

final class FilteredDrinks implements Drinks {
  private final Predicate<Drink> expression;
  private final Drinks drinks;

  FilteredDrinks(Predicate<Drink> expression, Drinks drinks) {
    this.expression = expression;
    this.drinks = drinks;
  }

  @Override
  public Iterator<Drink> iterator() {
    return stream(drinks.spliterator(), false)
      .filter(expression)
      .iterator();
  }
}
