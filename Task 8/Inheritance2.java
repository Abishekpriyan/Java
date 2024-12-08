package AllProgramming;
import java.util.Scanner;

class Course{
	public void Attributes(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Course Name :");
		String cname = sc.nextLine();
		System.out.print("Enter the Instuctor Name :");
		String iname = sc.nextLine();
		System.out.print("Enter the Credits :");
		int credit = sc.nextInt();
		System.out.println("Course Name is : " + cname);
		System.out.println("Instructor Name is : " + iname);
		System.out.println("Credits for the Course is : " + credit);
		sc.close();
	}
}

class OnlineCourse extends Course{
	public void Attributes2() {
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the Platform :");
	    String platform = sc1.nextLine();
	    System.out.println("The platform is : " + platform);
	    System.out.println("Enter the Duration in Days :");
	    int duration = sc1.nextInt();
	    sc1.nextLine();
	    
	    if (duration > 30) {
	        System.out.println("Duration you have Studied is : " + duration);
	        System.out.println("You are Eligible for Certification");
	    } else {
	        System.out.println("You are not Eligible for Certification");
	    }
	    sc1.close();
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		OnlineCourse obj = new OnlineCourse();
		obj.Attributes();
		obj.Attributes2();
	}
}