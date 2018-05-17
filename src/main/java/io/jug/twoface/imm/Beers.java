package io.jug.twoface.imm;

import java.util.Iterator;

import static io.jug.twoface.imm.Drink.Type.Beer;
import static java.util.stream.StreamSupport.stream;

final class Beers implements Drinks {
  private final Drinks drinks;

  Beers(Drinks drinks) {
    this.drinks = drinks;
  }

  @Override
  public Iterator<Drink> iterator() {
    return stream(drinks.spliterator(), false)
      .filter(it -> it.is(Beer))
      .iterator();
  }
}
