package io.jug.twoface.imm;

final class DrinkImpl implements Drink {
  private final Type type;
  private final String name;

  DrinkImpl(Type type, String name) {
    this.type = type;
    this.name = name;
  }

  @Override
  public boolean is(Type type) {
    return this.type == type;
  }
}
