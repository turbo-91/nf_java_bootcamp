package org.example;

public class Fibonacci {

    public static int calculate(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }




}
