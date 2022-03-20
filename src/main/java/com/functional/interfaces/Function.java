package com.functional.interfaces;


public interface Function<T, R> {
    R apply(T t);

    static <T, U, R> Function<T, R> compose(Function<U, R> f, Function<T, U> g) {
        return t -> f.apply(g.apply(t));
    }
}
