package AllProgramming;

public class task2 {
	
	static void add(int a,int b){
		
		System.out.println("The sum of two given Numbers is : "+ (a + b));
	
	}
	
	static int addwithreturn(int a,int b) {
	
		int sum= a + b;
		System.out.println("The sum of the given numbers is : "+sum);
		return sum;
	
	}
	
	static void relationalOperator(int a,int b) {
		
		System.out.print("Relational Operator");
	
		System.out.println("Equal to Operator : ");
		System.out.println(a==b);
		
		System.out.println("Not Equal to Operator : ");
		System.out.println(a!=b);
		
		System.out.println("Greater than Operator : ");
		System.out.println(a>b);
		
		System.out.println("Lesser than Operator : ");
		System.out.println(a<b);
		
		System.out.println("Greater than Equal to Operator : ");
		System.out.println(a>=b);
		
		System.out.println("Lesser than Equal to Operator : ");
		System.out.println(a<=b);
	}
	
	static void logicalOperator(int a,int b) {
	
		System.out.println("Logical Operator");
		
		System.out.println("Logical AND Operator : ");
		System.out.println((a<b)&&(a>=b));
	
		System.out.println("Logical OR Operator : ");
		System.out.println((a<b)||(a>=b));
		
		System.out.println("Logical NOT Operator : ");
		System.out.println(!(a<b));
	}
	
	public static void main(String[] args) {
		
		add(10,20);
		addwithreturn(30,40);
		relationalOperator(15,25);
		logicalOperator(15,25);

	}
}