package com.github.nikita_volkov.java.composites;

/**
 * Utility overloaded constructors.
 */
public final class Product {

  public static <_1, _2> Product2<_1, _2> product(_1 _1, _2 _2) {
    return new Product2<>(_1, _2);
  }

  public static <_1, _2, _3> Product3<_1, _2, _3> product(_1 _1, _2 _2, _3 _3) {
    return new Product3<>(_1, _2, _3);
  }

}
