package com.be.mathutil.test.core;

import com.be.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
// Báo với JUNIT và JVM rằng class này sẽ tách data ra khỏi câu lệnh assertEqual();
// Khi run class này thì JUNIT sẽ tự sinh ra thêm code để FILL DATA vào trong hàm Assert cho mình
// Mình phải viết code theo cách JUNIT yêu cầu thì mình mới tận dụng, sửa được BAD SMELL
// Dùng code theo cách thức bị ép tuân thủ một cái LOGIC nào đó thì đó là ta đang sài FRAMEWORK
public class MathUtilityAdvancedTest {

    // Chuẩn bị data mảng 2 chiều
    @Parameterized.Parameters
    public static Object[][] initData() {
        // mang 1 chieu 
        int a[] = {5, 10, 15, 20};

        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},};
    }
    // MAP 1 dòng gồm 2 cột bao gồm 2 biến n và EXCEPTION
    // JUNIT sẽ tự LOOP qua từng dòng của mảng để gắn data các cột vào 2 biến tương ứng
    @Parameterized.Parameter(value = 0)
    public int n;

    @Parameterized.Parameter(value = 1)
    public long expected;

    //TEST SO SÁNH
    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
