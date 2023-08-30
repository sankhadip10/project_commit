//# Problem Description
//        # Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p
//        # in the array equals p.
//        #
//        # Problem Constraints
//        # 1 <= |A| <= 2*10^5
//        # -10^8 <= A[i] <= 10^8
//        #
//        # Input Format
//        # First and only argument is an integer array A.
//        #
//        # Output Format
//        # Return 1 if any such integer p is present, else return -1.
//        #
//        # Example Input
//        # Input 1:
//        #  A = [3, 2, 1, 3]
//        # Input 2:
//        #  A = [1, 1, 3, 3]
//        #
//        # Example Output
//        # Output 1:
//        #  1
//        # Output 2:
//        #  -1
//        #
//        # Example Explanation
//        # Explanation 1:
//        #  For integer 2, there are 2 greater elements in the array.
//        # Explanation 2:
//        #  There exists no integer satisfying the required conditions.

package DataStructure.Intermediate1.Sorting;

import java.util.Arrays;

class NobleInteger {
    public int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == n - i - 1) {
                if (i < n - 1 && A[i] == A[i + 1]) {
                    continue;
                }
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example Input
        int[] inputArray1 = {3, 2, 1, 3};
        int[] inputArray2 = {1, 1, 3, 3};

        NobleInteger solution = new NobleInteger();
        int output1 = solution.solve(inputArray1);
        int output2 = solution.solve(inputArray2);

        System.out.println("Output 1: " + output1);  // Output: 1
        System.out.println("Output 2: " + output2);  // Output: -1
    }
}

