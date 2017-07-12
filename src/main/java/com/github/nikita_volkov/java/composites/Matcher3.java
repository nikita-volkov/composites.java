package com.github.nikita_volkov.java.composites;

/**
 * A pattern matcher for 3 cases.
 */
public interface Matcher3<case1, case2, case3, output> {
  output match1(case1 value);
  output match2(case2 value);
  output match3(case3 value);
}
