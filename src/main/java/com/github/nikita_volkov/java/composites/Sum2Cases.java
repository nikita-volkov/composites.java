package com.github.nikita_volkov.java.composites;

import java.util.Optional;

public interface Sum2Cases<_1, _2, output> {

  output _1(_1 input);
  output _2(_2 input);

  final class Optional1<_1, _2> implements Sum2Cases<_1, _2, Optional<_1>> {
    @Override
    public Optional<_1> _1(_1 input) {
      return Optional.of(input);
    }

    @Override
    public Optional<_1> _2(_2 input) {
      return Optional.empty();
    }
  }

  final class Optional2<_1, _2> implements Sum2Cases<_1, _2, Optional<_2>> {
    @Override
    public Optional<_2> _1(_1 input) {
      return Optional.empty();
    }

    @Override
    public Optional<_2> _2(_2 input) {
      return Optional.of(input);
    }
  }

}
