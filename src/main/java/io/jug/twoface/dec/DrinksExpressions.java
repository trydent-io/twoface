package io.jug.twoface.dec;

import java.util.function.Predicate;

import static io.jug.twoface.dec.Drink.Type.Alcoholic;
import static io.jug.twoface.dec.Drink.Type.Beer;

public enum DrinksExpressions implements Predicate<Drink> {
  IsBeer {
    @Override
    public boolean test(Drink drink) {
      return drink.is(Beer);
    }
  },

  IsAlcoholic {
    @Override
    public boolean test(Drink drink) {
      return drink.is(Alcoholic);
    }
  }
}
