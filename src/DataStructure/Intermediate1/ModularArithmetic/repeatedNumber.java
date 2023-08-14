/**
 * Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 * If there are multiple solutions, return any one.
 * Note: Read-only array means that the input array should not be modified in the process of solving the problem.
 *
 * Problem Constraints
 * 1 <= N <= 7*10^5
 * 1 <= A[i] <= 10^9
 *
 * Input Format
 * The only argument is an integer array A.
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * [1, 2, 3, 1, 1]
 * Input 2:
 * [1, 2, 3]
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * -1
 *
 * Example Explanation
 * Explanation 1:
 * 1 occurs 3 times which is more than 5/3 times.
 * Explanation 2:
 * No element occurs more than 3 / 3 = 1 times in the array.
 */

package DataStructure.Intermediate1.ModularArithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatedNumber {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber1(final List<Integer> a) {
        int n = a.size();
        int first = Integer.MAX_VALUE, count1 = 0;
        int second = Integer.MIN_VALUE, count2 = 0;

        //find the candidate elememts
        for(int i = 0; i < n; i++){
            if(a.get(i) == first){
                count1++;
            }
            else if(a.get(i) == second){
                count2++;
            }
            else if(count1 == 0){
                first = a.get(i);
                count1 = 1; // Fixed initialization of count1 to 1
            }
            else if(count2 == 0){
                second = a.get(i);
                count2 = 1; // Fixed initialization of count2 to 1
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i = 0; i < n; i++) {
            if(a.get(i) == first) {
                count1++;
            }
            if(a.get(i) == second) {
                count2++;
            }
        }
        if(count1 > n / 3) {
            return first;
        }
        else if(count2 > n / 3) {
            return second;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        scanner.close();
        repeatedNumber solution = new repeatedNumber();
        int result = solution.repeatedNumber1(a);
        System.out.println(result);
    }
}

