package Task;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		int i, j, row, space;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Rows : ");
		row = sc.nextInt();
		
		for(i = 1; i <= row;i++) {
		
			for(space = 1; space <= row-i; space++) {
				System.out.print(" ");
			}
			
			for(j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			
			System.out.println();
		}
	}
}