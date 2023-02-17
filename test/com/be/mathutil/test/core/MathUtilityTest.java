package com.be.mathutil.test.core;

import com.be.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest {
    // Hàm getFactorial() còn được thiết kế rằng nếu đưa tham số không đúng chuẩn n < 0 || n > 20
    // Thì hàm được thiết kế sẽ ném ra ngoại lệ - EXCEPTION
    // Tức là nếu đưa n < 0
    // Ví dụ: n = -5 thì sẽ nhận về - EXPECTED VALUE: EXCEPTION
    // Ta sẽ dùng JUNIT để TEST xem hàm có ném ra EXCEPTION như thiết kế hay không

//    @Test(expected = IllegalArgumentException.class)
//    @Test(expected = NumberFormatException.class)
    @Test(expected = Exception.class)

    public void testFactorialGivenWrongArgumentThrowsException() {
        // Nguyên tắc của kiểm thử là so sánh EXPECTED vs ACTUAL
        // Test Case #4: Test getFactotial() with n < 0 
        // EXPECTED: UNEXCEPTION is throw
        // In this case Illegal Argument Exception is throw
        // JUNIT 4 không có hàm assert() Exception
        // JUNIT 5 thì có
        MathUtil.getFactorial(-5);
        // neu chi viet lenh nay dung 1 minh thi co nghia la ta chua do luong, so sanh lieu rang 
        // Nếu chỉ viết lệnh này đúng một mình thì có nghĩa là ta chưa đo lường, so sánh liệu rằng
        // có ngoại lệ như EXPECTED hay không
        // Xanh đỏ trong tình huống này không phản ánh ý nghĩa đúng
        // Ta phải so xem ngoại lệ này đã có chưa
        // Nếu có rồi thì xanh còn lại chưa có thì đỏ
    }

    @Test
    // @test sẽ biến hàm dưới thành public static void main
    // @Test sẽ biến hàm dưới thành PUBLIC STATUC VOID MAIN
    // Hình thức của FRAMEWORK, dàn khung viết code
    // Viết code phải theo quy ước, định dạng yêu cầu trước
    public void testRedGreenSignal() {
        Assert.assertEquals(6789, 6789);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        // Test Case #1: test getFactorial() with n = 0 
        // EXPECTED: 1
        // Test hàm getFactorial() với n = 0, hy vọng trả về 1 => 0! = 1
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);

        // Test Case #2: test getFactorial() with n =1
        // EXPECTED: 1
        // Test hàm getFactorial() với n = 1, hy vọng trả về 1 => 1!=1
        n = 1;
        expected = 1;
        actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);

        // Test Case #3: test getFactorial() with n = 6
        // EXPECTED = 720;
        // Test hàm getFactorial() với n = 6, hy vọng trả về 720 => 6!=720
        n = 6;
        expected = 720;
        actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);

        // Viết kiểu assertEquals(expected, actual)
        // Lặp đi lặp lại, Bad Smell
        // Nhược điểm: bị trộn lẫn giữa lệnh so sánh và các loại DATA để Test
        // Vì trộn lẫn nên ta khó nhìn hết đầy đủ các TEST CASE => Nghịch lí thuốc trừ sâu
        // Ta sẽ FIX BAD SMELL CODE lặp lại bằng kĩ thuật DDT - DATA DRIVEN TESTING
    }
}
