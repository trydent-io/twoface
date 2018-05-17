package io.jug.twoface.dec;

import java.util.Iterator;
import java.util.List;

final class DrinksImpl implements Drinks {
  private final Drink[] drinks;

  DrinksImpl(Drink[] drinks) {
    this.drinks = drinks;
  }

  @Override
  public final Iterator<Drink> iterator() {
    return List.of(drinks).iterator();
  }
}
