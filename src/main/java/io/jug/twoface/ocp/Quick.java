package io.jug.twoface.ocp;

public class Quick implements Sorting {
  public int[] sort(int[] values) {
    return sort(values, 0, values.length - 1);
  }

  private int[] sort(int[] values, int low, int high) {
    var i = low;
    var j = high;

    var pivot = values[low + (high - low) / 2];

    while (i <= j) {
      while (values[i] < pivot) i++;
      while (values[j] > pivot) j--;
      if (i <= j) {
        swap(values, i, j);
        //move index to next position on both sides
        i++;
        j--;
      }
    }

    if (low < j)
      return sort(values, low, j);
    if (i < high)
      return sort(values, i, high);

    return values;
  }

  private void swap(int[] array, int i, int j) {
    var temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
