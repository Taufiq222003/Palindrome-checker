import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Input: ");
        String word = s1.next(); // used for taking user input.
        boolean palindrome = false;
        

        for (int l = 0; l< (word.length()/2);l++){
             char test1 = (char)(word.charAt(l)); 
             char test2 = (char)(word.charAt(word.length()-1-l));
             // checks if first number equal to last number or not and so on.

             if (test1 == test2){
                palindrome = true; // if first num = last num ... changes the boolean variable to true.
             }
             else{
                palindrome = false;
             }

        }
        System.out.println(palindrome);

    }
}
