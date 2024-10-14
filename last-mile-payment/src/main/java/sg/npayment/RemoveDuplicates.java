package sg.npayment;

public class RemoveDuplicates {
    // Function to remove duplicate characters
    public static String removeDuplicates(String s) {

        // Create an integer array to store
        // frequency for ASCII characters
        int[] ch = new int[256];
        StringBuilder ans = new StringBuilder();

        // Traverse the input string
        for (char c : s.toCharArray()) {

            // Check if current character's frequency is 0
            if (ch[c] == 0) {

                // Add char if frequency is 0
                ans.append(c);

                // Increment frequency
                ch[c]++;
            }
        }
        return ans.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeDuplicates(s));
    }
}
