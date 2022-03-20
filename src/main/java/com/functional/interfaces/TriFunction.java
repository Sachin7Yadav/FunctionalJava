package com.functional.interfaces;

public interface TriFunction<T, U, V, R> extends Function<T, BiFunction<U, V, R>> {
}
