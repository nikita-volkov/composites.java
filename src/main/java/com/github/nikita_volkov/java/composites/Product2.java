package com.github.nikita_volkov.java.composites;

public final class Product2<_1, _2> {

  public final _1 _1;
  public final _2 _2;

  public Product2(_1 _1, _2 _2) {
    this._1 = _1;
    this._2 = _2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product2<?, ?> product2 = (Product2<?, ?>) o;

    if (!_1.equals(product2._1)) return false;
    return _2.equals(product2._2);
  }

  @Override
  public int hashCode() {
    int result = _1.hashCode();
    result = 31 * result + _2.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Product2{" +
      "_1=" + _1 +
      ", _2=" + _2 +
      '}';
  }

}
