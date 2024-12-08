package AllProgramming;

import java.util.Scanner;

class GymMembership{
	
	public void Membership() {
	
		int trainerfees = 3000;
		int fees = 3000;
		int spafees = 2000;
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Name : ");
		String mname = sc.nextLine();
		System.out.println("Enter your duration : ");
		int duration = sc.nextInt();
		
		System.out.println("HI " + mname +" .Welcome!!");
		System.out.println("The Gym Membership prices are as follows");
		System.out.println("Premium Membership - Rs." + (trainerfees+fees+spafees)*duration);
		System.out.println("Normal Membership - Rs." + (trainerfees+fees)*duration);
		System.out.println("Basic Membership - Rs." + (fees)*duration);
		System.out.println("If any offers are Available then you will be informed");
		sc.close();
	}
}

class PremiumMembership extends GymMembership{

	public void premium() {
	
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter a valid option");
		System.out.println("1. Premium Membership \t2. Normal Membership \t3. Basic Membership ");
		int value = sc1.nextInt();
		
			{if(value == 1) {
				System.out.println("You have a Personal Trainer and have access to the Spa");
			}
			else if(value == 2) {
				System.out.println("You have a Personal Trainer but don't have access to the Spa");
			}
			else if(value == 3){
				System.out.println("You don't have a Personal Trainer and don't have access to the Spa");
			}
			else {
				System.out.println("Please enter a valid option");
			}}
			sc1.close();
	}
}
 
public class Inheritance3 {
	public static void main(String[] args) {
		
		PremiumMembership obj = new PremiumMembership();
		obj.Membership();
		obj.premium();
	}
}