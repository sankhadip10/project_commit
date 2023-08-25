package DataStructure.Intermediate1.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Problem Description
 * You are given a string A of size N consisting of lowercase alphabets.
 *
 * You can change at most B characters in the given string to any other lowercase alphabet such that
 * the number of distinct characters in the string is minimized.
 *
 * Find the minimum number of distinct characters in the resulting string.
 *
 * Problem Constraints
 * 1 <= N <= 100000
 * 0 <= B <= N
 *
 * Input Format
 * The first argument is a string A.
 * The second argument is an integer B.
 *
 * Output Format
 * Return an integer denoting the minimum number of distinct characters in the string.
 *
 * Example Input
 * A = "abcabbccd"
 * B = 3
 *
 * Example Output
 * 2
 *
 * Example Explanation
 * We can change both 'a' and one 'd' into 'b'. So the new string becomes "bbcbbbccb".
 * So the minimum number of distinct characters will be 2.
 */

public class changeCharacter {
    public int solve(String A, int B) {
        int count[] = new int[26];
        int index = 0;
        for(int i=0;i<A.length();i++){
            index = A.charAt(i) - 'a';
            count[index] = count[index] + 1;
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<26;i++){
            if(count[i] > 0){
                al.add(count[i]);
            }
        }
        Collections.sort(al);

        for(int i=0;i<al.size();i++){
            B=B-al.get(i);
            if(B<0){
                return al.size()-i;
            }
        }
        return 1;   //if B size is very lartge
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the string:");
        String A = scanner.nextLine();

        System.out.println("Please enter the number of characters you can change:");
        int B = scanner.nextInt();

        changeCharacter solution = new changeCharacter();
        int result = solution.solve(A, B);

        System.out.println("The minimum number of distinct characters in the resulting string is: " + result);

        scanner.close();
    }
}

//Tc---O(n)
//Sc---->O(1)
