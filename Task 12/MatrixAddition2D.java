package Task;

import java.util.Scanner;

public class MatrixAddition2D {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int row, col;

        // Input Rows and Columns
        System.out.println("Enter the Number of Rows for the Matrix: ");
        row = sc.nextInt();
        System.out.println("Enter the Number of Columns for the Matrix: ");
        col = sc.nextInt();

        // Declare Matrix
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int c[][] = new int[row][col];

        // Input for Matrix 1
        System.out.println("Enter the elements of Matrix 1: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.println("Enter the elements of Matrix 2: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        
        // Perform matrix Addition
        System.out.println("\nMatrix after Addition:\n");
		for(int i = 0; i < row; i++) {
	
			for(int j = 0; j < col; j++) {
		
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			
			}
		
			System.out.println();
		}sc.close();
	}
}