package ch.juventus.recursion;

public class PalindromeRecursive {

    public boolean checkIfPalindrome(String input) {
        if (input.length() < 2) {
            return true;
        }
        input = input.toLowerCase();
        if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
            // here is the "entry and exit" point of the recursion:
            return (checkIfPalindrome(input.substring(1, input.length() - 1)));
        } else {
            return false;
        }
    }
}
