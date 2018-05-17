package io.jug.twoface.dec;

import java.util.List;
import java.util.Objects;

final class DrinkImpl implements Drink {
  private final Type[] types;
  private final String name;

  DrinkImpl(String name, Type[] types) {
    this.types = types;
    this.name = name;
  }

  @Override
  public boolean is(Type type) {
    return List.of(this.types).contains(type);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DrinkImpl drink = (DrinkImpl) o;
    return Objects.equals(name, drink.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return name;
  }
}
