//# Problem Description
//        # Given an integer array A of size N. You can remove any element from the array in one operation.
//        # The cost of this operation is the sum of all elements in the array present before this operation.
//        #
//        # Find the minimum cost to remove all elements from the array.
//        #
//        # Problem Constraints
//        # 0 <= N <= 1000
//        # 1 <= A[i] <= 103
//        #
//        # Input Format
//        # First and only argument is an integer array A.
//        #
//        # Output Format
//        # Return an integer denoting the total cost of removing all elements from the array.
//        #
//        # Example Input
//        # Input 1:
//        #  A = [2, 1]
//        # Input 2:
//        #  A = [5]
//        #
//        # Example Output
//        # Output 1:
//        #  4
//        # Output 2:
//        #  5
//        #
//        # Example Explanation
//        # Explanation 1:
//        #  Given array A = [2, 1]
//        #  Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
//        #  Remove 1 from the array => []. Cost of this operation is (1) = 1.
//        #  So, total cost is = 3 + 1 = 4.
//        # Explanation 2:
//        #  There is only one element in the array. So, cost of removing is 5.

package DataStructure.Intermediate1.Sorting;

import java.util.Arrays;

class ElementsRemoval {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);

        int count = 1;  // a+2b+3c+4d
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += count * A[i];

            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example Input
        int[] inputArray1 = {2, 1};
        int[] inputArray2 = {5};

        ElementsRemoval solution = new ElementsRemoval();
        int output1 = solution.solve(inputArray1);
        int output2 = solution.solve(inputArray2);

        System.out.println("Output 1: " + output1);  // Output: 4
        System.out.println("Output 2: " + output2);  // Output: 5
    }
}
