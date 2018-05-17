package io.jug.twoface.imm;

import static java.util.Arrays.copyOf;

public interface Drinks extends Iterable<Drink> {
  static Drinks of(Drink... drinks) {
    return new DrinksImpl(copyOf(drinks, drinks.length));
  }
}
