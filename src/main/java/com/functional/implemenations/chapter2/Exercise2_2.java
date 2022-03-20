package com.functional.implemenations.chapter2;

import com.functional.interfaces.Function;

public class Exercise2_2 {
    public static Function<Integer, Integer> triple = x -> x * 3;
    public static Function<Integer, Integer> square = x -> x * x;

    public static void main(String[] args) {
        System.out.println(triple.apply(4));
        System.out.println(square.apply(5));
    }
}
