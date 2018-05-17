package io.jug.twoface.dec;

import static io.jug.twoface.dec.Drink.Type.Alcoholic;
import static io.jug.twoface.dec.Drink.Type.Beer;
import static io.jug.twoface.dec.Drink.Type.Cocktail;
import static io.jug.twoface.dec.Drink.Type.NonAlcoholic;
import static io.jug.twoface.dec.Drink.Type.Soft;
import static io.jug.twoface.dec.Drink.Type.Wine;
import static java.util.Arrays.copyOf;

public interface Drink {
  enum Type { Soft, Alcoholic, NonAlcoholic, Wine, Beer, Cocktail }

  boolean is(Type type);

  static Drink tassoni() { return soft("Tassoni"); }
  static Drink freewayCola() { return soft("Freeway Cola"); }
  static Drink grog() { return alcoholic("LeChuck's Grog"); }
  static Drink elaine() { return nonAlcoholic("Guybrush Threepwood's Grog"); }
  static Drink teroldego() { return wine("Teroldego"); }
  static Drink montepulciano() { return wine("Montepulciano d'Abruzzo"); }
  static Drink ipa() { return beer("Ipa"); }
  static Drink paleAle() { return beer("Pale Ale"); }
  static Drink corona() { return nonBeer("Corona"); }

  private static Drink soft(final String name) { return drink(name, Soft); }
  private static Drink alcoholic(final String name) { return drink(name, Alcoholic, Cocktail); }
  private static Drink nonAlcoholic(final String name) { return drink(name, NonAlcoholic, Cocktail); }
  private static Drink wine(final String name) { return drink(name, Alcoholic, Wine); }
  private static Drink beer(final String name) { return drink(name, Alcoholic, Beer); }
  private static Drink nonBeer(final String name) { return drink(name, NonAlcoholic, Beer); }

  private static Drink drink(final String name, final Type... types) {
    return new DrinkImpl(name, copyOf(types, types.length));
  }
}
