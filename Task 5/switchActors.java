package AllProgramming;

import java.util.Scanner;

public class switchActors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int actress,hero;
		
		System.out.println("Enter any of these 1 - Samantha\t2 - Nayanthara\t3 - Andrea");
		System.out.println("Enter any one option :");
		actress=sc.nextInt();
		
		switch (actress) {
		
		case 1://Samantha
		
			System.out.println("Our Favourite actress is Samantha");			
			System.out.println("1 - Vijay\t2 - Dhanush\t3 - Surya");
			System.out.println("Enter the Actor Name :");
			hero=sc.nextInt();
			
			switch(hero) {
			case 1:
				System.out.println("Theri");
				break;
			case 2:
				System.out.println("Thangamagan");
				break;
			case 3:
				System.out.println("24");
				break;
			default:
				System.out.println("Please Enter a Valid Option.");
				break;
			}
			break;
		
		case 2://Nayanthara
			
			System.out.println("Our Favourite actress is Nayanthara");			
			System.out.println("1 - Vijay\t2 - Rajini\t3 - Dhanush");
			System.out.println("Enter the Actor Name :");
			hero=sc.nextInt();
			
			switch(hero) {
			case 1:
				System.out.println("Bigil");
				break;
			case 2:
				System.out.println("Annathae");
				break;
			case 3:
				System.out.println("Yaradi Nee Mohini");
				break;
			default:
				System.out.println("Please Enter a Valid Option.");
				break;
			}
			break;
		
		case 3://Andrea
		
			System.out.println("Our Favourite actress is Andrea");			
			System.out.println("1 - Dhanush\t2 - Karthi\t3 - SundarC");
			System.out.println("Enter the Actor Name :");
			hero=sc.nextInt();
			
			switch(hero) {
			case 1:
				System.out.println("Vadachennai");
				break;
			case 2:
				System.out.println("Ayirathil Oruvan");
				break;
			case 3:
				System.out.println("Arranmanai");
				break;
			default:
				System.out.println("Please Enter a Valid Option.");
				break;
			}
			break;
			
		default:
			System.out.println("Please Enter a Valid Option.");
			break;
		}
	sc.close();
	}
}