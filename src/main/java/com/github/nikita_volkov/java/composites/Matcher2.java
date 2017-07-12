package com.github.nikita_volkov.java.composites;

/**
 * A pattern matcher for 2 cases.
 */
public interface Matcher2<case1, case2, output> {
  output match1(case1 value);
  output match2(case2 value);
}
