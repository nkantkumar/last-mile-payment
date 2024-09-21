package sg.quick.labmda;

import java.util.Arrays;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7, 6);
        System.out.println("Sum 7,6): " + result);
        result = sumCalculator.sum(15, -35);
        System.out.println("Sum 15, -35): " + result);

        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
        stringList.replaceAll(str -> str.toLowerCase());

        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage of the original values: " + average);
    }
}
