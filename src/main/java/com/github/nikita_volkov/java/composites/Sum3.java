package com.github.nikita_volkov.java.composites;

import java.util.Optional;

public interface Sum3<_1, _2, _3> {

  <output> output match(Sum3Cases<_1, _2, _3, output> cases);

  default Optional<_1> _1() {
    return match(new Sum3Cases.Optional1<>());
  }

  default Optional<_2> _2() {
    return match(new Sum3Cases.Optional2<>());
  }

  default Optional<_3> _3() {
    return match(new Sum3Cases.Optional3<>());
  }

}
