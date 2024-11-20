package AllProgramming;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = obj.nextLine();

	        // Reverse the string
	        String reverse = new StringBuilder(input).reverse().toString();

	        // Check if the original and reversed strings are equal
	        if (input.equalsIgnoreCase(reverse)) {
	            System.out.println("The string "+input +" is a palindrome.");
	        } else {
	            System.out.println("The string "+input +" is not a palindrome.");
	        }

	        obj.close();
	    }
	}

