//# Problem Description
//        # Given an integer array A of size N, find the first repeating element in it.
//        # We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
//        # If there is no repeating element, return -1.
//
//        # Problem Constraints
//        # 1 <= N <= 105
//        # 1 <= A[i] <= 109
//
//        # Input Format
//        # The first and only argument is an integer array A of size N.
//
//        # Output Format
//        # Return an integer denoting the first repeating element.
//
//        # Example Input
//        # Input 1:
//        #  A = [10, 5, 3, 4, 3, 5, 6]
//        # Input 2:
//        #  A = [6, 10, 5, 4, 9, 120]
//
//        # Example Output
//        # Output 1:
//        #  5
//        # Output 2:
//        #  -1
//
//        # Example Explanation
//        # Explanation 1:
//        #  5 is the first element that repeats
//        # Explanation 2:
//        #  There is no repeating element, output -1
package DataStructure.Intermediate1.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeating {
    // Function to find the first repeating element in the array
    public int findFirstRepeating(int[] A) {
        int n = A.length;
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currentElement = A[i];
            if (!hashmap.containsKey(currentElement)) {
                hashmap.put(currentElement, 1);
            } else {
                return currentElement; // Found the first repeating element
            }
        }

        return -1; // No repeating element found
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 1, 2}; // Example input
        FirstRepeating firstRepeating = new FirstRepeating();
        int result = firstRepeating.findFirstRepeating(A);

        if (result == -1) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("The first repeating element is: " + result);
        }
    }
}
