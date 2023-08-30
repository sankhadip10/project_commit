//# Problem Description
//        # Given an array A of non-negative integers, arrange them such that they form the largest number.
//        #
//        # Note: The result may be very large, so you need to return a string instead of an integer.
//        #
//        # Problem Constraints
//        # 1 <= len(A) <= 100000
//        # 0 <= A[i] <= 2*10^9
//        #
//        # Input Format
//        # The first argument is an array of integers.
//        #
//        # Output Format
//        # Return a string representing the largest number.
//        #
//        # Example Input
//        # Input 1:
//        #  A = [3, 30, 34, 5, 9]
//        # Input 2:
//        #  A = [2, 3, 9, 0]
//        #
//        # Example Output
//        # Output 1:
//        #  "9534330"
//        # Output 2:
//        #  "9320"
//        #
//        # Example Explanation
//        # Explanation 1:
//        # Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
//        # Explanation 2:
//        # Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.

        package DataStructure.Intermediate1.Sorting;

import java.util.Arrays;
import java.util.Comparator;

class LargestNumber {
    public String largestNumber(int[] A) {
        String[] strArray = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            strArray[i] = Integer.toString(A[i]);
        }

        Arrays.sort(strArray, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (strArray[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strArray) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example Input
        int[] inputArray1 = {3, 30, 34, 5, 9};
        int[] inputArray2 = {2, 3, 9, 0};

        LargestNumber solution = new LargestNumber();
        String output1 = solution.largestNumber(inputArray1);
        String output2 = solution.largestNumber(inputArray2);

        System.out.println("Output 1: " + output1);  // Output: "9534330"
        System.out.println("Output 2: " + output2);  // Output: "9320"
    }
}
