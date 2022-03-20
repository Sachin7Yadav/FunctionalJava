package com.functional.implemenations.chapter2;

import com.functional.interfaces.BiFunction;
import com.functional.interfaces.QuadFunction;
import com.functional.interfaces.TriFunction;

public class Exercise2_3 {
    public static BiFunction<Integer, Integer, Integer> add = x -> y -> x + y;
    public static BiFunction<Long, Double, Integer> addF = aLong -> aDouble -> (int) (aDouble + aLong);
    public static TriFunction<Long, Double, String, Integer> addFun = aLong -> aDouble -> s -> (int) (Integer.parseInt(s) + aDouble + aLong);
    public static QuadFunction<Long, Double, String, Boolean, Integer> addFunction = aLong -> aDouble -> s -> aBoolean -> (int) ((aBoolean ? 1 : 0) + Integer.parseInt(s) + aDouble + aLong);


    public static void main(String[] args) {
        System.out.println(add.apply(4).apply(2));
        System.out.println(addF.apply(4L).apply(2.0));
    }

}
