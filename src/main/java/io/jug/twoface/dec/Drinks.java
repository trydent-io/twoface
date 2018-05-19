package io.jug.twoface.dec;

public interface Drinks extends Iterable<Drink> {
  static Drinks of(Drink... drinks) {
    return new DrinksImpl(drinks);
  }
}
