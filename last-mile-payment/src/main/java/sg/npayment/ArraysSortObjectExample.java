package sg.npayment;

import java.util.Arrays;

public class ArraysSortObjectExample {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "David", "Eve"};
        Arrays.sort(names);
        System.out.println("Sorted Array: " + Arrays.toString(names));
        // Output: Sorted Array: [Alice, Bob, David, Eve, John]
    }
}
