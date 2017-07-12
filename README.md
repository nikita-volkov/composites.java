# Composites for Java

A library of polymorphic composite types (Sums and Products, aka Unions and Tuples) for Java.
It provides a lean and simple API which highly resembles Pattern-matching in such languages as Haskell and Scala.
The API is type-safe and avoids the `instanceof` checks. The sum-types are implemented efficiently without any redundant fields.
The library is light-weight and doesn't bring in any dependencies whatsoever.

# Example

In the following example we have a function, which pattern-matches on a sum-type over `Long` and `Double`.

```java
import com.github.nikita_volkov.java.composites.*;
import junit.framework.TestCase;

public class Test extends TestCase {

  private String longOrDoubleToString(Sum2<Long, Double> longOrDouble) {
    return longOrDouble.match(new Matcher2<Long, Double, String>() {
      public String match1(Long value) {
        return "Case1(" + value.toString() + ")";
      }

      public String match2(Double value) {
        return "Case2(" + value.toString() + ")";
      }
    });
  }

  public void test() {
    assertEquals("Case1(3)", longOrDoubleToString(new Sum2.Case1<>(3L)));
    assertEquals("Case2(7.1)", longOrDoubleToString(new Sum2.Case2<>(7.1D)));
  }

}
```

# Maven

```xml
<dependency>
  <groupId>com.github.nikita-volkov.java</groupId>
  <artifactId>composites</artifactId>
  <version>1</version>
</dependency
```