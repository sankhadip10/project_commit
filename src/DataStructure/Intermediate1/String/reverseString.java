/**
 * Problem Description:
 * You are given a string A of size N.
 * Return the string A after reversing the string word by word.
 *
 * NOTE:
 * - A sequence of non-space characters constitutes a word.
 * - Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * - If there are multiple spaces between words, reduce them to a single space in the reversed string.
 *
 * Problem Constraints:
 * 1 <= N <= 3 * 10^5
 *
 * Input Format:
 * The only argument given is string A.
 *
 * Output Format:
 * Return the string A after reversing the string word by word.
 *
 * Example Input:
 * Input 1:
 * A = "the sky is blue"
 * Input 2:
 * A = "this is ib"
 *
 * Example Output:
 * Output 1:
 * "blue is sky the"
 * Output 2:
 * "ib is this"
 *
 * Example Explanation:
 * Explanation 1:
 * We reverse the string word by word so the string becomes "blue is sky the".
 * Explanation 2:
 * We reverse the string word by word so the string becomes "ib is this".
 */

package DataStructure.Intermediate1.String;

import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
    public static String reverse(String A){
        //e.g. this is scaler
        char[] chars =A.trim().toCharArray();

        //reversing the entire array
        //e.g relacs si siht
        rev(chars,0,chars.length-1);

        //Reverse each word individually
        int start = 0;
        int writeindex = 0;
        for (int end = 0; end < chars.length; end++) {
            if (chars[end] == ' ') {
                if (end > start) {
                    rev(chars, start, end - 1);

                    for (int i = start; i < end; i++) {
                        chars[writeindex++] = chars[i];
                    }
                    chars[writeindex++] = ' ';
                }
                start = end + 1;
            }

        }

        //Reverse the last word as it doesn't end with space
        if(start<chars.length){
            rev(chars,start,chars.length-1);
            for (int i = start; i <chars.length; i++) {
                chars[writeindex++] = chars[i];
            }
        }

//        return new String(chars, 0, writeIdx > 0 && chars[writeIdx - 1] == ' ' ? writeIdx - 1 : writeIdx);
        return new String(chars, 0, writeindex);
    }

    public static void rev(char[] chars, int start, int end){

        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output =reverse(input);
        System.out.print("Reversed String is:");
        System.out.println(output);
    }
}
