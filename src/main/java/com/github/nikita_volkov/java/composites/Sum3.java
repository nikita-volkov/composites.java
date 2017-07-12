package com.github.nikita_volkov.java.composites;

public interface Sum3<case1, case2, case3> {

  <output> output match(Matcher3<case1, case2, case3, output> matcher);

  final class Case1<case1, case2, case3> implements Sum3<case1, case2, case3> {
    public final case1 value;

    public Case1(case1 value) {
      this.value = value;
    }

    @Override
    public <output> output match(Matcher3<case1, case2, case3, output> matcher) {
      return matcher.match1(value);
    }
  }

  final class Case2<case1, case2, case3> implements Sum3<case1, case2, case3> {
    public final case2 value;

    public Case2(case2 value) {
      this.value = value;
    }

    @Override
    public <output> output match(Matcher3<case1, case2, case3, output> matcher) {
      return matcher.match2(value);
    }
  }

  final class Case3<case1, case2, case3> implements Sum3<case1, case2, case3> {
    public final case3 value;

    public Case3(case3 value) {
      this.value = value;
    }

    @Override
    public <output> output match(Matcher3<case1, case2, case3, output> matcher) {
      return matcher.match3(value);
    }
  }

}
