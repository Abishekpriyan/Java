package AllProgramming;

public class TenaryOperator {

	public static void main(String[] args) {
		
		// variable=Expression1?Expression2:Expression3
		//The condition in Expression1 will be executed then if it is TRUE then it will perform the task
		//Expression2 or else if it false the it will perform the task in Expression3.
		
		int n1 = 6, n2 = 10, max;
		System.out.println("First Num " + n1);
		System.out.println("Second Num " + n2);
		max=(n1>n2)?n1:n2;
		System.out.println("Maximum " + max);
				
		int res=(n1>n2)?(n1+n2):(n2-n1);
		System.out.println("Result " + res);
	}

}
//to add 2 number using method parameters
//to add 2 numbers using return type
//to implement all the relational and logical operator