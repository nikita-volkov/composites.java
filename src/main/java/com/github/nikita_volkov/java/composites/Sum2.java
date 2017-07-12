package com.github.nikita_volkov.java.composites;

/**
 * A sum class which is defined by how to pattern-match on it.
 */
public interface Sum2<case1, case2> {

  <output> output match(Matcher2<case1, case2, output> matcher);

  final class Case1<case1, case2> implements Sum2<case1, case2> {
    public final case1 value;

    public Case1(case1 value) {
      this.value = value;
    }

    @Override
    public <output> output match(Matcher2<case1, case2, output> matcher) {
      return matcher.match1(value);
    }
  }

  final class Case2<case1, case2> implements Sum2<case1, case2> {
    public final case2 value;

    public Case2(case2 value) {
      this.value = value;
    }

    @Override
    public <output> output match(Matcher2<case1, case2, output> matcher) {
      return matcher.match2(value);
    }
  }

}
