package AllProgramming;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		//Scanner class is used to get the input from the user
		//its available in util package
		//nextInt() nextLong() nextLine() can be used
				
		Scanner obj=new Scanner (System.in);
		
		System.out.println("Enter the Name: ");
		String name=obj.nextLine();
		
		System.out.println("Enter the Age: ");
		int age=obj.nextInt();
		
		System.out.println("Enter the Number: ");
		long num=obj.nextLong();
		
		System.out.println("Enter the Rating: ");
		float rate=obj.nextFloat();
		
		System.out.println("Enter the Salary: ");
		double salary=obj.nextDouble();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Number : "+num);
		System.out.println("Rating : "+rate);
		System.out.println("Salary : "+salary);
	}

}
