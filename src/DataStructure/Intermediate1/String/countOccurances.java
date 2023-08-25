/**
 * Problem Description
 * Find the number of occurrences of "bob" in string A consisting of lowercase English alphabets.
 *
 * Problem Constraints
 * 1 <= |A| <= 1000
 *
 * Input Format
 * The first and only argument contains the string A, consisting of lowercase English alphabets.
 *
 * Output Format
 * Return an integer containing the answer.
 *
 * Example Input
 * Input 1:
 *   "abobc"
 * Input 2:
 *   "bobob"
 *
 * Example Output
 * Output 1:
 *   1
 * Output 2:
 *   2
 *
 * Example Explanation
 * Explanation 1:
 *   The only occurrence is at the second position.
 * Explanation 2:
 *   "Bob" occurs at the first and third positions.
 */

package DataStructure.Intermediate1.String;

import java.util.Scanner;

public class countOccurances {
    public int solve(String A) {
        int count = 0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)=='b' && A.charAt(i+1)=='o' && A.charAt(i+2)=='b'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String A = scanner.nextLine();
        countOccurances countOccurrences = new countOccurances();
        int result = countOccurrences.solve(A);
        System.out.println("The number of occurrences of 'bob' in the given string is: " + result);
        scanner.close();
    }

}

