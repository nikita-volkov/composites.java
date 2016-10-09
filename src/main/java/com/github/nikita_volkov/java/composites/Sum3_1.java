package com.github.nikita_volkov.java.composites;

public final class Sum3_1<_1, _2, _3> implements Sum3<_1, _2, _3> {
  private final _1 value;

  public Sum3_1(_1 value) {
    this.value = value;
  }

  @Override
  public <output> output match(Sum3Cases<_1, _2, _3, output> cases) {
    return cases._1(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return value.equals(((Sum3_1) o).value);
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  @Override
  public String toString() {
    return "Sum3_1{" + value + '}';
  }

}
