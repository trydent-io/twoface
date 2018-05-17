---
author: 'Luca Guadagnini'
title: 'Two face - OOP vs. FP'
patat:
    theme:
        title: [vividGreen]
        header: [vividWhite,bold]
        emph: [vividGreen]
        code: [dullBlack,onDullWhite]
        codeBlock: [dullBlack,onDullWhite]
...

#How many times do we need to flip the coin?

 * What are you talking about?
 * No matter what you must be SOLID
 * Design patterns

#What are you talking about?

```java
import java.util.function.UnaryOperator;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.iterate;

public interface Main {
  static void main(String... args) {
    final int[] identity = {0, 1};
    final UnaryOperator<int[]> next = array -> new int[]{array[1], array[0] + array[1]};

    out.println(
      iterate(identity, next)
        .limit(10)
        .map(it -> it[0])
        .collect(toList())
    );
  }
}
```

#No matter what you must be SOLID

##Vending coffee machine kata

 * As vendor I want to add the coffee product
 * As vendor I want to add an ingredient
