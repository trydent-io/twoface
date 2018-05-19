package io.jug.twoface.dip;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

class NewOrderTest {
  private static Function<Integer, Predicate<Integer>> lt = x -> y -> y < x;
  private static Function<Integer, Predicate<Integer>> gte = x -> y -> y >= x;

  public static List<Integer> qsort(List<Integer> values) {
    return values.isEmpty()
      ? values
      : concat(
      concat(
        qsort(values.stream()
          .skip(1)
          .filter(lt.apply(values.get(0)))
          .collect(toList())).stream(),
        of(values.get(0))),
      qsort(values.stream()
        .skip(1)
        .filter(gte.apply(values.get(0)))
        .collect(toList())).stream())
      .collect(toList());
  }

  @Test
  void shouldOrderInts() {
  }
}
