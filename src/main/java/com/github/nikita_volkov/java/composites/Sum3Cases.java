package com.github.nikita_volkov.java.composites;

import java.util.Optional;

public interface Sum3Cases<_1, _2, _3, output> {

  output _1(_1 input);
  output _2(_2 input);
  output _3(_3 input);

  final class Optional1<_1, _2, _3> implements Sum3Cases<_1, _2, _3, Optional<_1>> {
    @Override
    public Optional<_1> _1(_1 input) {
      return Optional.of(input);
    }

    @Override
    public Optional<_1> _2(_2 input) {
      return Optional.empty();
    }

    @Override
    public Optional<_1> _3(_3 input) {
      return Optional.empty();
    }
  }

  final class Optional2<_1, _2, _3> implements Sum3Cases<_1, _2, _3, Optional<_2>> {
    @Override
    public Optional<_2> _1(_1 input) {
      return Optional.empty();
    }

    @Override
    public Optional<_2> _2(_2 input) {
      return Optional.of(input);
    }

    @Override
    public Optional<_2> _3(_3 input) {
      return Optional.empty();
    }
  }

  final class Optional3<_1, _2, _3> implements Sum3Cases<_1, _2, _3, Optional<_3>> {
    @Override
    public Optional<_3> _1(_1 input) {
      return Optional.empty();
    }

    @Override
    public Optional<_3> _2(_2 input) {
      return Optional.empty();
    }

    @Override
    public Optional<_3> _3(_3 input) {
      return Optional.of(input);
    }
  }

}
