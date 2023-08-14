//Majority Element
//        Problem Description
//        Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times. You may assume that the array is non-empty and the majority element always exists in the array.
//
//        Problem Constraints
//        1 <= N <= 5 * 10^5
//        1 <= num[i] <= 10^9
//        Input Format
//        Only argument is an integer array.
//
//        Output Format
//        Return an integer.
//
//        Example Input
//        Input 1:
//
//        csharp
//        Copy code
//        [2, 1, 2]
//        Input 2:
//
//        csharp
//        Copy code
//        [1, 1, 1]
//        Example Output
//        Output 1:
//
//        Copy code
//        2
//        Output 2:
//
//        Copy code
//        1
//        Example Explanation
//        For Input 1: 2 occurs 2 times which is greater than 3/2, so it is the majority element.
//
//        For Input 2: 1 is the only element in the array, so it is the majority element.

package DataStructure.Intermediate1.ModularArithmetic;

import java.util.Arrays;
import java.util.List;

public class SolutionMagicNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int majority = A.get(0);
        int count =0;
        int n=A.size();
        if(A==null)
            return -1;

        for(int i=0;i<n;i++){
            if(A.get(i)==majority){
                count++;
            }

            //the rerson for else if is we need to change the majority right for different elements in a n array
            else if(count==1){
                majority=A.get(i);
            }
            else{
                count--;
            }
            if(count==0){
                majority=A.get(i);
                count=0;
            }
        }

        for(int i=0;i<n;i++){
            if(A.get(i)==majority){
                count++;
            }
        }
        if(count>n/2)
            return majority;
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 3, 4, 2, 3);
        SolutionMagicNumber solution = new SolutionMagicNumber();
        int majorityElement = solution.majorityElement(A);
        System.out.println("The majority element is: " + majorityElement); // Output will be 3
    }
}

