package io.jug.twoface.dec;

import java.util.Iterator;

import static io.jug.twoface.dec.Drink.Type.Alcoholic;
import static java.util.stream.StreamSupport.stream;

final class AlcoholicsOnly implements Drinks {
  private final Drinks drinks;

  AlcoholicsOnly(Drinks drinks) {
    this.drinks = drinks;
  }

  @Override
  public Iterator<Drink> iterator() {
    return stream(drinks.spliterator(), false)
      .filter(it -> it.is(Alcoholic))
      .iterator();
  }
}
