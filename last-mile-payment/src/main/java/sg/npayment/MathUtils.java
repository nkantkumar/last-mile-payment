package sg.npayment;

import java.util.function.IntBinaryOperator;

public class MathUtils {
    public static void main(String[] args) {
        IntBinaryOperator operator = MathUtilsCheck::multiply;
        int result = operator.applyAsInt(4, 5);
        System.out.println(result);
    }

    public class MathUtilsCheck {
        public static int multiply(int a, int b) {
            return a * b;
        }
    }
}
