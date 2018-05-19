package io.jug.twoface.ocp;

public class SelectionDesc extends Selection {
  @Override
  public int[] sort(int[] values) {
    for (int i = 0; i < values.length - 1; i++) {
      var index = i;
      for (int j = i + 1; j < values.length; j++)
        if (values[j] > values[index])
          index = j;

      swap(values, i, index);
    }
    return values;
  }

  private void swap(int[] values, int i, int index) {
    var swapped = values[index];
    values[index] = values[i];
    values[i] = swapped;
  }
}
