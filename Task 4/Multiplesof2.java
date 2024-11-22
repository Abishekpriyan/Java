package AllProgramming;

import java.util.Scanner;

public class Multiplesof2 {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the numbers to be Checked :");
	int num = obj.nextInt();
	if(num % 2 == 0) {
		System.out.println(num+" is a Multiple of 2");
	}
	else {
		System.out.println(num+" is not a Multiple of 2");
	}
	obj.close();
	}
}