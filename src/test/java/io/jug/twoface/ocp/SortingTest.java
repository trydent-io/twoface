package io.jug.twoface.ocp;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class SortingTest {
  private static final int[] ORDERED = {1, 2, 3, 4, 5};
  private static final int[] REVERSED = {5, 4, 3, 2, 1};

  @Test
  void shouldSort() {
    final Sorting selection = new Selection();
    assertThat(selection.sort(REVERSED))
      .asList()
      .containsExactly(1, 2, 3, 4, 5)
      .inOrder();
  }
}