package AllProgramming;

import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {

		System.out.println("To print the Average of the Values in the Array");
		
		int sum = 0, average = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Elements in the Array : ");
		int num = sc.nextInt();
		
		int array[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("Enter the " + (i+1) + " Element : ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		average = sum/num;
		System.out.println("The Sum of the Array is : " + sum);
		System.out.println("The Average of the Array is : " + average);
		sc.close();
	
	}
}