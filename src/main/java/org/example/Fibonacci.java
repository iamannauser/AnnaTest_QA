package org.example;

import java.util.stream.Stream;

public class Fibonacci {
    public static long fibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(n)
                .reduce((a, b) -> b)
                .get()[0];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    }
}
