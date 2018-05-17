package io.jug.twoface.ocp;

import java.util.function.BiPredicate;

final class Selection implements Sorting {
  private final BiPredicate<Integer, Integer> orderBy;

  Selection(BiPredicate<Integer, Integer> orderBy) {
    this.orderBy = orderBy;
  }

  public int[] sort(int[] values) {
    for (int i = 0; i < values.length - 1; i++) {
      var index = i;
      for (int j = i + 1; j < values.length; j++)
        if (orderBy.test(values[j], values[index]))
          index = j;

      swap(values, i, index);
    }
    return values;
  }

  public void swap(int[] values, int i, int index) {
    var swapped = values[index];
    values[index] = values[i];
    values[i] = swapped;
  }
}
