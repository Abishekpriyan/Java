package AllProgramming;

class Encapsulate {

	private String name;
	private int age;
	private int roll;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}

public class Encapsulation{
public static void main(String [] args) {
		
	Encapsulate obj = new Encapsulate();
	obj.setName("Abishek");
	obj.setAge(22);
	obj.setRoll(12);
	
	System.out.println("Name: " + obj.getName());
	System.out.println("Age : " + obj.getAge());
	System.out.println("Roll Number : " + obj.getRoll());
	
    }	
}
