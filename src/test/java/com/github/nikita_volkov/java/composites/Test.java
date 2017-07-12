package com.github.nikita_volkov.java.composites;

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
