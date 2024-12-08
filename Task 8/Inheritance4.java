package AllProgramming;

import java.util.Scanner;

abstract class Shapes{

	public abstract void rectangle();
	public abstract void circle();
	public abstract void triangle();
}

class Shapes1 extends Shapes{
	
	public void rectangle() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Breadth of the Rectangle : ");
		int b = sc.nextInt();
		System.out.println("Enter the Length of the Rectangle : ");
		int l = sc.nextInt();
		int area = b*l;
		System.out.println("The area of the Rectangle is : "+area);
		sc.close();
	}
	
	public void circle() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Radius of the Circle : ");
		int r = sc.nextInt();
		int area = (int)3.14*r*r;
		System.out.println("The area of the Circle is : "+area);
		sc.close();
	}
	
	public void triangle() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Base of the Triangle : ");
		int b = sc.nextInt();
		System.out.println("Enter the Height of the Triangle : ");
		int h = sc.nextInt();
		int area = (1/2)*b*h;
		System.out.println("The area of the Triangle is : "+area);
		sc.close();
	}
}

public class Inheritance4 {
    public static void main(String[] args) {
    	Shapes1 obj = new Shapes1();
    	obj.rectangle();
    	obj.circle();
    	obj.triangle();
   
    }
}
