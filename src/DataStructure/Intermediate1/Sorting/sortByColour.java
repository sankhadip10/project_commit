//# Problem Description
//        # Given an array with N objects colored red, white, or blue, sort them so that objects of the same color
//        # are adjacent, with the colors in the order red, white, and blue.
//        #
//        # We will represent the colors as,
//        # red -> 0
//        # white -> 1
//        # blue -> 2
//        #
//        # Note: Using the library sort function is not allowed.
//        #
//        # Problem Constraints
//        # 1 <= N <= 1000000
//        # 0 <= A[i] <= 2
//        #
//        # Input Format
//        # First and only argument of input contains an integer array A.
//        #
//        # Output Format
//        # Return an integer array in the required order.
//        #
//        # Example Input
//        # Input 1:
//        #     A = [0, 1, 2, 0, 1, 2]
//        # Input 2:
//        #     A = [0]
//        #
//        # Example Output
//        # Output 1:
//        #     [0, 0, 1, 1, 2, 2]
//        # Output 2:
//        #     [0]
//        #
//        # Example Explanation
//        # Explanation 1:
//        #     [0, 0, 1, 1, 2, 2] is the required order.
//        # Explanation 2:
//        #     [0] is the required order.

        package DataStructure.Intermediate1.Sorting;

class SortByColour {
    public int[] sortColors(int[] A) {
        int low = 0, mid = 0, high = A.length - 1;

        while (mid <= high) {
            if (A[mid] == 0) {
                int temp = A[low];
                A[low] = A[mid];
                A[mid] = temp;
                low++;
                mid++;
            } else if (A[mid] == 1) {
                mid++;
            } else {
                int temp = A[mid];
                A[mid] = A[high];
                A[high] = temp;
                high--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        // Example Input
        int[] inputArray1 = {0, 1, 2, 0, 1, 2};
        int[] inputArray2 = {0};

        SortByColour solution = new SortByColour();
        int[] output1 = solution.sortColors(inputArray1);
        int[] output2 = solution.sortColors(inputArray2);

        System.out.print("Output 1: ");
        for (int num : output1) {
            System.out.print(num + " ");  // Output: 0 0 1 1 2 2
        }
        System.out.println();

        System.out.print("Output 2: ");
        for (int num : output2) {
            System.out.print(num + " ");  // Output: 0
        }
        System.out.println();
    }
}

