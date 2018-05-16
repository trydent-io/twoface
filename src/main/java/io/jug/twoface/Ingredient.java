package io.jug.twoface;

public class Ingredient implements Comparable<Ingredient> {
  private String name = "";
  private double cost = 0.00;
  private int stock = 0;

  public Ingredient(String name, double cost) {
    this.name = name;
    this.cost = cost;
    this.stock = 10;
  }

  public int compareTo(Ingredient ingredient) {
    return name.compareTo(ingredient.getName());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}