package AllProgramming;

import java.util.Scanner;

public class Task3_5 {

	public static void main(String[] args) {
		
		int year;
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the year : ");
		year= obj.nextInt();
		
		if(year%4==0) {
			System.out.println("It is a Leap Year.");
		}
		else{
			System.out.println("It is not a Leap Year.");
		}
		
		obj.close();
	}
}