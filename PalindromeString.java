package task5;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the String :");
        String s1 = sc.nextLine();  // Read the input string

        // Initialize an empty string to store the reversed string
        String s2 = "";

        // Loop to reverse the input string
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);  // Append each character in reverse order
        }

        // Check if the original string and reversed string are equal
        if (s1.equals(s2)) {
            System.out.println("String is palindrome: " + s2);
        } else {
            System.out.println("String is not palindrome " + s2);
        }
        
        sc.close();  // Close the scanner object
    }
}
