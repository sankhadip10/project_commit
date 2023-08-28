/**
 * Problem Description:
 * Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
 * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 * For instance: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * <p>
 * Problem Constraints:
 * 0 <= sum of length of all strings <= 1000000
 * <p>
 * Input Format:
 * The only argument given is an array of strings A.
 * <p>
 * Output Format:
 * Return the longest common prefix of all strings in A.
 * <p>
 * Example Input:
 * Input 1:
 * A = ["abcdefgh", "aefghijk", "abcefgh"]
 * Input 2:
 * A = ["abab", "ab", "abcd"];
 * <p>
 * Example Output:
 * Output 1:
 * "a"
 * Output 2:
 * "ab"
 * <p>
 * Example Explanation:
 * Explanation 1:
 * Longest common prefix of all the strings is "a".
 * Explanation 2:
 * Longest common prefix of all the strings is "ab".
 */


package DataStructure.Intermediate1.String;

import java.util.ArrayList;
import java.util.Arrays;

public class longestCommonprefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        if (A.size() == 0) {
            return "";
        }
        String res = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i).length());
        }


        for (int i = 0; i < min; i++) {
            char c = A.get(0).charAt(i);

            for (int j = 1; j < A.size(); j++) { //check the character c matches for every string
                if (c != A.get(j).charAt(i)) {
                    return res;
                }
            }
            res += c;
        }
        return res;
    }


    public static void main(String[] args) {
        longestCommonprefix solution = new longestCommonprefix();

        // Prepare test data
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("abab", "ab", "abcd"));

        // Test case 1
        System.out.println("Input: " + list1);
        System.out.println("Output: " + solution.longestCommonPrefix(list1));

        // Test case 2
        System.out.println("Input: " + list2);
        System.out.println("Output: " + solution.longestCommonPrefix(list2));
    }
}