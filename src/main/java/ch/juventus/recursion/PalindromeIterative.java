package ch.juventus.recursion;

import java.util.Scanner;

public class PalindromeIterative {

        public static void checkIfPalindrome()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER STRING: ");
            String userInputString = input.nextLine();
            String reverseString="";

            int stringLength = userInputString.length();

            for (int i = stringLength - 1; i >= 0; i--)
                reverseString += userInputString.charAt(i);

            if (userInputString.equals(reverseString))
                System.out.println("PALINDROME");
            else
                System.out.println("NOPE");
        }

}
