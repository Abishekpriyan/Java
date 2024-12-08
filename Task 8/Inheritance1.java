package AllProgramming;
import java.util.Scanner;

class Vehicle {
	public void Attributes(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Make :");
		String make=sc.nextLine();
		System.out.print("Enter the Model :");
		String model=sc.nextLine();
		System.out.print("Enter the Year :");
		int year=sc.nextInt();
		System.out.println("Make of the vehicle is : " + make);
		System.out.println("Model of the Vehicle is : " + model);
		System.out.println("Year of the Vehicle is : " + year);
		sc.close();
	}
}

class Car extends Vehicle{
	public void Size() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Trunk Size :");
		int Tsize =sc.nextInt();
		System.out.println("The Trunk Size of the Car is :" + Tsize);
		sc.close();
	}
}

class Truck extends Vehicle{
	public void Capacity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Payload Capacity :");
		int Pcapacity =sc.nextInt();
		System.out.println("The Payload Capacity of the truck is : " + Pcapacity);
		sc.close();
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.Attributes();
		obj.Size();

		Truck obj1 = new Truck();
		obj1.Attributes();
		obj1.Capacity();
		
	}

}