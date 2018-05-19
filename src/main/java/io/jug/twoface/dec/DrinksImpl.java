package io.jug.twoface.dec;

import io.jug.twoface.cursor.Cursor;

import java.util.Iterator;

final class DrinksImpl implements Drinks {
  private final Drink[] drinks;

  DrinksImpl(Drink[] drinks) {
    this.drinks = drinks;
  }

  @Override
  public final Iterator<Drink> iterator() {
    return Cursor.forward(drinks);
  }
}
