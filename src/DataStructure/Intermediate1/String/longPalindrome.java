/**
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first (with the least starting index).
 *
 * Problem Constraints
 * 1 <= N <= 6000
 *
 * Input Format
 * First and only argument is a string A.
 *
 * Output Format
 * Return a string denoting the longest palindromic substring of string A.
 *
 * Example Input
 * Input 1:
 * A = "aaaabaaa"
 * Input 2:
 * A = "abba
 *
 * Example Output
 * Output 1:
 * "aaabaaa"
 * Output 2:
 * "abba"
 *
 * Example Explanation
 * Explanation 1:
 * We can see that the longest palindromic substring is of length 7 and the string is "aaabaaa".
 * Explanation 2:
 * We can see that the longest palindromic substring is of length 4 and the string is "abba".
 */

package DataStructure.Intermediate1.String;

public class longPalindrome {
    public String longestPalindrome(String A) {
        int n = A.length();
        int start = 0; // Start index of longest palindrome
        int max_length = 0; // Length of longest palindrome

        for (int i = 0; i < n; i++) {
            // Check for odd-length palindrome centered at i
            int p1 = i;
            int p2 = i;
            while (p1 >= 0 && p2 < n && A.charAt(p1) == A.charAt(p2)) {
                p1--;
                p2++;
            }
            p1++; // Adjust p1 to correct position
            p2--; // Adjust p2 to correct position
            if (p2 - p1 + 1 > max_length) {
                start = p1;
                max_length = p2 - p1 + 1;
            }

            // Check for even-length palindrome centered at i
            p1 = i - 1;
            p2 = i;
            while (p1 >= 0 && p2 < n && A.charAt(p1) == A.charAt(p2)) {
                p1--;
                p2++;
            }
            p1++; // Adjust p1 to correct position
            p2--; // Adjust p2 to correct position
            if (p2 - p1 + 1 > max_length) {
                start = p1;
                max_length = p2 - p1 + 1;
            }
        }

        return A.substring(start, start + max_length);
    }

    public static void main(String[] args) {
        longPalindrome solution = new longPalindrome();

        String input1 = "aaaabaaa";
        String input2 = "abbag";

        String output1 = solution.longestPalindrome(input1);
        String output2 = solution.longestPalindrome(input2);

        System.out.println("Longest palindromic substring of " + input1 + " is: " + output1);
        System.out.println("Longest palindromic substring of " + input2 + " is: " + output2);
    }
}




