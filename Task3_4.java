package AllProgramming;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		
		int num1,num2,num3,temp,tot=0;
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number to be Checked :");
		num1= obj.nextInt();
		
		temp=num1;
		num3=String.valueOf(num1).length();
		
		while(num1>0) {
			num2= num1%10;
			tot += Math.pow(num2, num3);
			num1=num1/10;
		}
		
		if(tot==temp) {
			System.out.println("Yes,It is an Armstrong Number.");
		}
		else {
			System.out.println("No, It is not an Armstrong Number.");
		}
		obj.close();
	}
}