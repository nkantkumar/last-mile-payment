package sg.npayment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysSortObjectExample {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "David", "Eve"};
        int[] A  = {1,3,5};
        Arrays.sort(names);
        System.out.println("Sorted Array: " + Arrays.toString(names));
        // Output: Sorted Array: [Alice, Bob, David, Eve, John]
        Arrays.stream(A).boxed().collect(Collectors.toList());
    }
}
