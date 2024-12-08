package AllProgramming;

interface Person{
	void name();
	void age();
}

public class Inheritance5 implements Person{
	String name;
	int age;
	
	public void constructor(){
		this.name=name;
		this.age=age;
	}
	
	public void name(String name) {
		System.out.println("My Name is " + name + ".");				
	}
	
	public void age(int age) {
		System.out.println("My age is " + age + ".");		
	}
	
	public static void main(String[] args) {
		Inheritance5 obj = new Inheritance5();
		obj.name("Abishek");
		obj.age(22);
	}

}
