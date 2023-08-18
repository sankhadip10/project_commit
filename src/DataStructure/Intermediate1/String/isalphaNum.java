/**
 * Problem Description
 *
 * You are given a function isalpha() consisting of a character array A.
 *
 * Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * Input Format
 * Only argument is a character array A.
 *
 * Output Format
 * Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.
 *
 * Example Input
 * Input 1:
 * A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
 * Input 2:
 * A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 0
 *
 * Example Explanation
 * Explanation 1:
 * All the characters are alphanumeric.
 * Explanation 2:
 * All the characters are NOT alphanumeric i.e ('#').
 */


package DataStructure.Intermediate1.String;

public class isalphaNum {
    public int solve(char[] A) {
        for (int i = 0; i < A.length; i++) {
            if (!((A[i] >= 65 && A[i] <= 90) || (A[i] >= 97 && A[i] <= 122) || (A[i] >= 0 && A[i] <= '9'))) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        isalphaNum alphaNumChecker = new isalphaNum();

        char[] input1 = "abcdABCD123".toCharArray();
        char[] input2 = "123abc#".toCharArray();

        int output1 = alphaNumChecker.solve(input1);
        int output2 = alphaNumChecker.solve(input2);

        System.out.println("The result for input1 is: " + output1); // Output will be 1
        System.out.println("The result for input2 is: " + output2); // Output will be 0
    }
}
