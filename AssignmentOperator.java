package AllProgramming;
public class AssignmentOperator {

	public static void main(String[] args) {
		int num=1;
		String name="Java";
		System.out.println("Num "+num);
		System.out.println("Name "+name);
		
		//+= operator
		int a=10;
		a+=10;//a=a+10
		System.out.println("The value of a is "+a);
		
		// && -- (Logical AND), > -- Greater
		System.out.println((5>3) && (8>5));
		
		// && -- (Logical AND), < -- Lesser
		System.out.println((5<3) && (8<5));
		
		// || -- (Logical OR)
		System.out.println((5<3) || (8<5));
		
		// ! -- (Logical NOT)
		System.out.println(!(5<3));
		
	}
}