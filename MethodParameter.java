package AllProgramming;
public class MethodParameter {
	
	static void mymethod(String fname) {
		System.out.println(fname+"Argument Added");
	}
	
	static void mymethod1(String fname,int a) {
		System.out.println(fname+" "+a);
	}
	
	static String mystring(String fname) {
		System.out.println(fname);
		return fname;
	}
	
	static float myint(int a) {
		System.out.println("The value is "+a);
		return a;
	}
	
	public static void main(String[] args) {
	
		mymethod("Ram");
		mymethod("Anjana");
		mymethod("Jenny");
		
		mymethod1("Ram",1);
		mymethod1("Anjana",2);
		mymethod1("Jenny",3);
		
		mystring("Hi");
		myint(1);
	
	}

}