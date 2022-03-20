package com.functional.implemenations.chapter2;

import com.functional.interfaces.Function;

import static com.functional.interfaces.Function.compose;

public class Exercise2_4 {

    public static <T, U, R> Function<Function<T, R>, Function<Function<U, T>, Function<U, R>>> higherOrderCompose() {
        return trFunction -> utFunction -> u -> trFunction.apply(utFunction.apply(u));
    }

    public static <T, U, R> Function<Function<T, U>, Function<Function<U, R>, Function<T, R>>> higherAndThen() {
        return tuFunction -> urFunction -> t -> urFunction.apply(tuFunction.apply(t));
    }


    public static void main(String[] args) {
        Function<Integer, Integer> compose = compose(Exercise2_2.square, Exercise2_2.triple);
        System.out.println(compose.apply(4));
        Integer apply = Exercise2_4.<Integer, Integer, Integer>higherOrderCompose().apply(Exercise2_2.square).apply(Exercise2_2.triple).apply(3);
        Integer apply1 = Exercise2_4.<Integer, Integer, Integer>higherAndThen().apply(Exercise2_2.triple).apply(Exercise2_2.square).apply(3);
        System.out.println(apply);
        System.out.println(apply1);
    }
}
