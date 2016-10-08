package com.github.nikita_volkov.java.composites;

public final class Product3<_1, _2, _3> {

  public final _1 _1;
  public final _2 _2;
  public final _3 _3;

  public Product3(_1 _1, _2 _2, _3 _3) {
    this._1 = _1;
    this._2 = _2;
    this._3 = _3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product3<?, ?, ?> product3 = (Product3<?, ?, ?>) o;

    if (!_1.equals(product3._1)) return false;
    if (!_2.equals(product3._2)) return false;
    return _3.equals(product3._3);

  }

  @Override
  public int hashCode() {
    int result = _1.hashCode();
    result = 31 * result + _2.hashCode();
    result = 31 * result + _3.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Product3{" +
      "_1=" + _1 +
      ", _2=" + _2 +
      ", _3=" + _3 +
      '}';
  }

}
