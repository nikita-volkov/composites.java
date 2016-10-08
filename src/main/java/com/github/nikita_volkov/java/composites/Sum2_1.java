package com.github.nikita_volkov.java.composites;

public final class Sum2_1<_1, _2> implements Sum2<_1, _2> {
  private final _1 value;

  public Sum2_1(_1 value) {
    this.value = value;
  }

  @Override
  public <output> output match(Sum2Cases<_1, _2, output> cases) {
    return cases._1(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return value.equals(((Sum2_1) o).value);
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  @Override
  public String toString() {
    return "Sum2._1{value=" + value + '}';
  }

}
