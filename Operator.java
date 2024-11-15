package AllProgramming;
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		//operator + ,- ,* ,/--Quotient ,%--remainder
		//operator--a+b +--perform the task
		//operand-- a,b --just to store the variable
		//using scanner class min two 
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		a=obj.nextInt();
		System.out.println("Enter the Number 2: ");
		b=obj.nextInt();
		
		System.out.println("The Addition of "+a+" and "+b+" is "+(a+b)+".");
		System.out.println("The Subtraction of "+a+" and "+b+" is "+(a-b)+".");
		System.out.println("The Multiplication of "+a+" and "+b+" is "+(a*b)+".");
		System.out.println("The Division of "+a+" and "+b+" is "+(a/b)+".");
		System.out.println("The Modulus of "+a+" and "+b+" is "+(a%b)+".");
			
	}
}