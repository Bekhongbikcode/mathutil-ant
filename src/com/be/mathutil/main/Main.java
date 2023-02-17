package com.be.mathutil.main;

import com.be.mathutil.core.MathUtil;

public class Main {

    public static void main(String[] args) {
        testFactorialGivenWrongArgumentReturnsExcept();
        testFactorialGivenRightArgumentReturnsWell();

    }

    // Kiểm thử các tình huống ERROR
    public static void testFactorialGivenWrongArgumentReturnsExcept() {
        // Test Case 6: test getFactorial() with n = -1
        // EXPECTED VALUE: an Illegal Argument Exception is throw
        // nếu đưa n = -1 thì hàm sẽ throw EXCEPTION
        System.out.println("Test - 1! | expected : Illegal Argument Exception is throw!!!"
                + "actual: ???");
        MathUtil.getFactorial(-1);
    }

    public static void testFactorialGivenRightArgumentReturnsWell() {
        // Case 1: test getFactorial() with n = 0 
        // EXPECTED VALUE: 1
        // Kiểm thử coi 0! = 1 hay không
        // Gọi là 1 TEST CASE 
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtil.getFactorial(n); // Gọi hàm tính giai thừa xem kết quả trả về
        // So sánh EXPECTED vs Actual
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        // Case 2: test getFactorial() with n = 1
        // EXPECTED VALUE: 1
        // kiểm tra xem 1! = 1 hay không
        n = 1;
        expectedValue = 1;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        // Case 3: test getFactorial() with n = 2
        // EXPECTED value: 2
        // Kiểm tra xem 2! = 2 hay không
        n = 2;
        expectedValue = 2;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        // Case 4: test getFactorial() with n = 3
        // EXPECTED VALUE: 6
        // Kiểm tra xem 3! = 6 hay không
        n = 3;
        expectedValue = 6;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        // Case 5: test getFactorial() with n = 4
        // EXPECTED VALUE: 24
        // Kiểm tra xem 4! = 24 hay không
        n = 4;
        expectedValue = 24;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        // Case 6: test getFactorial() with n = 5
        // EXPECTED VALUE: 120
        // Kiểm tra xem 5! = 120 hay không
        n = 5;
        expectedValue = 120;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("test" + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);
    }
}
//Dân Dev phải có trách nhiệm với những hàm/method mình viết
// Hàm getFactorial() được thiết kế rằng: nếu đưa n < 0 hoặc n > 20 -> EXCEPTION
// Dân Dev sẽ phải kiểm thử đúng như thiết kế
// mô phỏng lại chức năng, tình huống - CASE
// đưa data tử tế hoặc ngược lại
