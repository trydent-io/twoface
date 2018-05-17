package io.jug.twoface.ocp;

import org.junit.jupiter.api.Test;

import java.util.function.BiPredicate;

import static com.google.common.truth.Truth.assertThat;

class SortingTest {
  private static final int[] ORDERED = {1, 2, 3, 4, 5};
  private static final int[] REVERSED = {5, 4, 3, 2, 1};

  @Test
  void shouldSort() {
    assertThat(new Selection((val1, val2) -> val1 < val2)
      .sort(REVERSED))
      .asList()
      .containsExactly(1, 2, 3, 4, 5)
      .inOrder();
  }

  @Test
  void shouldSortDesc() {
    assertThat(new Selection((val1, val2) -> val1 > val2)
      .sort(ORDERED))
      .asList()
      .containsExactly(5, 4, 3, 2, 1)
      .inOrder();
  }
}