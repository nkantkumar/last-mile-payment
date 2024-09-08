package sg.npayment;

import java.util.Arrays;
import java.util.Comparator;

public class FineSecondHighestElementFromArray {

    public static void main(String[] args) {

        int[] numbers = {5, 13, 41, 88, 99, 77};

        Integer SecondHighestElement = Arrays.stream(numbers)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        System.out.println(SecondHighestElement);
    }
}