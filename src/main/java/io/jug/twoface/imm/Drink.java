package io.jug.twoface.imm;

import static io.jug.twoface.imm.Drink.Type.Alcoholic;
import static io.jug.twoface.imm.Drink.Type.Beer;
import static io.jug.twoface.imm.Drink.Type.NonAlcoholic;
import static io.jug.twoface.imm.Drink.Type.Soft;
import static io.jug.twoface.imm.Drink.Type.Wine;

public interface Drink {
  enum Type { Soft, Alcoholic, NonAlcoholic, Wine, Beer }

  boolean is(Type type);

  static Drink tassoni() { return soft("Tassoni"); }
  static Drink freewayCola() { return soft("Freeway Cola"); }
  static Drink grog() { return alcoholic("LeChuck's Grog"); }
  static Drink elaine() { return nonAlcoholic("Guybrush Threepwood's Grog"); }
  static Drink teroldego() { return wine("Teroldego"); }
  static Drink montepulciano() { return wine("Montepulciano d'Abruzzo"); }
  static Drink ipa() { return beer("Ipa"); }
  static Drink paleAle() { return beer("Pale Ale"); }

  private static Drink soft(final String name) { return drink(name, Soft); }
  private static Drink alcoholic(final String name) { return drink(name, Alcoholic); }
  private static Drink nonAlcoholic(final String name) { return drink(name, NonAlcoholic); }
  private static Drink wine(final String name) { return drink(name, Wine); }
  private static Drink beer(final String name) { return drink(name, Beer); }

  private static Drink drink(final String name, final Type type) {
    return new DrinkImpl(type, name);
  }
}
