/**
 * Problem Description
 *
 * You are given a function to_lower() which takes a character array A as an argument.
 *
 * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
 * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
 *
 * Return the lowercase version of the given character array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 *
 *
 * Input Format
 * The only argument is a character array A.
 *
 *
 *
 * Output Format
 * Return the lowercase version of the given character array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
 * Input 2:
 *
 *  A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']
 *
 *
 * Example Output
 * Output 1:
 *
 *  ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
 * Output 2:
 *
 *  ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  All the characters in the returned array are in lowercase alphabets.
 * Explanation 2:
 *  Since there is no lowercase version for '#', '2'and '0'. It remains unchanged.
 *  Rest of the Uppercase alphabets are converted to lowercase accordingly.
 */

package DataStructure.Intermediate1.String;

public class toLower {
    public char[] to_lower(char[] A) {
        for (int i = 0; i < A.length; i++) {
            //if its in the range of capital letters
            if (A[i] >= 65 && A[i] <= 90) {
                A[i] = (char) (A[i] + 32);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        toLower lowerConverter = new toLower();

        char[] input1 = "ScalEr Academy".toCharArray();
        char[] input2 = "HELLO, WORLD!".toCharArray();

        char[] output1 = lowerConverter.to_lower(input1);
        char[] output2 = lowerConverter.to_lower(input2);

        System.out.println("The result for input1 is: " + new String(output1)); // Output will be "scaler academy"
        System.out.println("The result for input2 is: " + new String(output2)); // Output will be "hello, world!"
    }
}
