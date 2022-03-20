package com.functional;


import com.functional.interfaces.Function;

public class Main {

    public Double cos(Double aDouble) {
        return Function.compose(z -> Math.PI/2 - z, Math::sin).apply(aDouble);
    }
    public static void main(String[] args) {
    }

}
