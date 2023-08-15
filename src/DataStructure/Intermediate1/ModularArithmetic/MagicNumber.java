package DataStructure.Intermediate1.ModularArithmetic;

import java.util.Scanner;

public class MagicNumber{
    public int solve(int A) {
        int pow=1;
        int ans = 0;
        while(A != 0){
            pow =pow*5;
            if((A & 1)==1){
                ans+=pow;
            }
            A=A>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        MagicNumber magicNumber = new MagicNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();

        int result = magicNumber.solve(A);

        System.out.println("The result for input " + A + " is " + result);
        scanner.close();
    }
}

