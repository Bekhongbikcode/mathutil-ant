package com.be.mathutil.core;

public class MathUtil {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        // 21! vượt kiểu Long - 18 con số 0 nên ta thí nghiệm hàm n!
        // n = 0..20 đủ kiểu Long
        long fac = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 ..20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fac *= i;
            }
        }
        return fac;
    }
}
