package DataStructure.Intermediate1.String;

import java.util.Scanner;

public class reverseStringBruteForce {

    public String reverse(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i= words.length-1;i>=0;i--){
            reversed.append(words[i]);

            if(i!=0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }


    public static void main(String[] args) {
        reverseStringBruteForce rv = new reverseStringBruteForce();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String word=scanner.nextLine();
        String result =rv.reverse(word);

        System.out.println(result);
    }
}
