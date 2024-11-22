package AllProgramming;

import java.util.Scanner;

public class ReverseTriangleInNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of the rows : ");
		int i,j;
		int r=sc.nextInt();
		
		for(i=1;i<=r;i++) {
			for(j=r;j>=i;j--) {
				System.out.print(i);
				
			}
			System.out.println();
		}
		sc.close();

	}

}
