package com.functional.interfaces;

public interface QuadFunction<T, U, V, X, R> extends Function<T, TriFunction<U, V, X, R>> {
}
