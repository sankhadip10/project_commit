/**
 * Problem Description
 * Given a string A, you are asked to reverse the string and return the reversed string.
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * String A consist only of lowercase characters.
 *
 * Input Format
 * First and only argument is a string A.
 *
 * Output Format
 * Return a string denoting the reversed string.
 *
 * Example Input
 * Input 1:
 *
 * A = "scaler"
 * Input 2:
 *
 * A = "academy"
 *
 * Example Output
 * Output 1:
 *
 * "relacs"
 * Output 2:
 *
 * "ymedaca"
 *
 * Example Explanation
 * Explanation 1:
 *
 * Reverse the given string.
 */
package DataStructure.Intermediate1.String;

import java.util.Scanner;

public class simpleReverse {
        public String solve(String A) {
            int p1 = 0;
            int p2 = A.length()-1;
            char[] c = A.toCharArray();

            while(p1 < p2){
                char temp = c[p1];
                c[p1] = c[p2];
                c[p2] = temp;
                p1++;
                p2--;
            }
            return new String(c);
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        simpleReverse reverse = new simpleReverse();
        String result = reverse.solve(input);
        System.out.println("Reversed string: " + result);
    }
}
