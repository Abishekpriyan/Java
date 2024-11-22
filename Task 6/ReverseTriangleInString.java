package AllProgramming;

import java.util.Scanner;

public class ReverseTriangleInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number of Rows :");
		int r = sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=r;j>i;j--) {
				
				System.out.print((char) (64+j));
			} 
		System.out.println();
		}
	sc.close();	
	}

}
