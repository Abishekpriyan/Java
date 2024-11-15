package AllProgramming;

public class MethodOverloading {
	public int sum(int x,int y) {
		return(x+y);
	}
	
	public int sum(int x,int y,int z) {
		return(x+y+z);
	}
	
	public double sum(double x,double y) {
		return(x+y);
	}
	
	public double sum(double x,double y,double z) {
		return(x+y+z);
	}

	public static void main(String[] args) {
		// Method Overloading is also known as function oveloading that allows multiple method to have 
		//same method name but different parameters
		MethodOverloading mo1=new MethodOverloading();
		System.out.println(mo1.sum(10, 20));
		System.out.println(mo1.sum(10, 20, 30));
		System.out.println(mo1.sum(10, 20));
		
	}
}