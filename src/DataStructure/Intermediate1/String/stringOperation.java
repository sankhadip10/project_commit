/**
 * Problem Description:
 * Akash likes playing with strings. One day he thought of applying the following operations on the string in the given order:
 * 1. Concatenate the string with itself.
 * 2. Delete all the uppercase letters.
 * 3. Replace each vowel with '#'.
 *
 * You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
 *
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 *
 * Problem Constraints:
 * 1 <= N <= 100000
 *
 * Input Format:
 * First argument is a string A of size N.
 *
 * Output Format:
 * Return the resultant string.
 *
 * Example Input:
 * Input 1:
 * A = "aeiOUz"
 * Input 2:
 * A = "AbcaZeoB"
 *
 * Example Output:
 * Output 1:
 * "###z###z"
 * Output 2:
 * "bc###bc###"
 *
 * Example Explanation:
 * Explanation 1:
 * First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
 * Delete all the uppercase letters so string A becomes "aeizaeiz".
 * Now replace vowel with '#', A becomes "###z###z".
 * Explanation 2:
 * First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
 * Delete all the uppercase letters so string A becomes "bcaeobcaeo".
 * Now replace vowel with '#', A becomes "bc###bc###".
 */


package DataStructure.Intermediate1.String;

public class stringOperation {

    public String solve(String A) {
        String ans = "";
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (!(c >= 'A' && c <= 'Z')) { //Delete all the uppercase letters so checking not uppercase
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { //Replace each vowel with '#'.
                    ans = ans + '#';
                } else {
                    ans = ans + c;
                }
            }
        }
        ans = ans + ans; //Concatenate the string with itself.
        return ans;
    }

    public static void main(String[] args) {
        stringOperation obj = new stringOperation();

        // Test case 1
        String test1 = "aeiOUz";
        System.out.println("Input: " + test1);
        System.out.println("Output: " + obj.solve(test1));

        // Test case 2
        String test2 = "AbcaZeoB";
        System.out.println("Input: " + test2);
        System.out.println("Output: " + obj.solve(test2));
    }
}
