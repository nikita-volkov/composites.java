package com.github.nikita_volkov.java.composites;

import java.util.Optional;

public interface Sum2<_1, _2> {

  <output> output match(Sum2Cases<_1, _2, output> cases);

  default Optional<_1> _1() {
    return match(new Sum2Cases.Optional1<>());
  }

  default Optional<_2> _2() {
    return match(new Sum2Cases.Optional2<>());
  }

}
