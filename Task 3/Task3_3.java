package AllProgramming;

import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
		
		int i,num;
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number for the table which is need to be Displayed : ");
		num= obj.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i)+".");
		}
		
		obj.close();
	}
}