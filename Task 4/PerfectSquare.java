package AllProgramming;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
        int num,sqrt;
		Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a number to be Checked :");
        num = obj.nextInt();
        
        sqrt = (int) Math.sqrt(num);
        
        if(sqrt * sqrt == num) {
        	System.out.println("The given Number "+num+" is a Perfect Square");
        }else{
        	System.out.println("The given Number "+num+" is not a Perfect Square");
        }
        obj.close();
    }
}