package AllProgramming;
import java.util.Scanner;
public class SwitchMovies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int actor,movie;
		
		System.out.println("Enter any of these 1 - vijay\t2 - rajini\t3 - kamal");
		System.out.println("Enter any one option :");
		actor=sc.nextInt();
		
		switch (actor) {
		
		case 1://Vijay
		
			System.out.println("Our Favourite actor is Vijay");			
			System.out.println("1 - Leo		2 - Master\t3 - GOAT\t4 - Naalaiya Theerpu\t5 - Sendhoorapandi");
			System.out.println("Enter the Movie :");
			movie=sc.nextInt();
			
			switch(movie) {
			case 1:
				System.out.println("Leo is an Blockbuster Hit Movie");
				break;
			case 2:
				System.out.println("Master is an Blockbuster Hit Movie");
				break;
			case 3:
				System.out.println("GOAT is an Blockbuster Hit Movie");
				break;
			case 4:
				System.out.println("Naalaiya Theerpu is not an Blockbuster Hit Movie");
				break;
			case 5:
				System.out.println("Sendhoorapandi is not an Blockbuster Hit Movie");
				break;
			default:
				System.out.println("Please Enter a Valid Option.");
				break;
			}
			break;
		
		case 2://Rajini
			
			System.out.println("Our Favourite actor is Rajini");			
			System.out.println("1 - Jailer\t2 - Petta\t3 - Darbar\t4 - Mangudi Minor\t5 - Shankar Saleem Simon");
			System.out.println("Enter the Movie :");
			movie=sc.nextInt();
			
			switch(movie) {
			case 1:
				System.out.println("Jailer is an Blockbuster Hit Movie");
				break;
			case 2:
				System.out.println("Petta is an Blockbuster Hit Movie");
				break;
			case 3:
				System.out.println("Darbar is an Blockbuster Hit Movie");
				break;
			case 4:
				System.out.println("Mangudi Minor is not an Blockbuster Hit Movie");
				break;
			case 5:
				System.out.println("Shankar Saleem Simon is not an Blockbuster Hit Movie");
				break;
			default:
				System.out.println("Please Enter a Valid Option.");
				break;
			}
			break;
		
		case 3://Kamal
		
			System.out.println("Our Favourite actor is Kamal");			
			System.out.println("1 - Vikram\t2 - Thevar Magan\t3 - Guna\t4 - Samasya\t5 - Thiruvonam");
			System.out.println("Enter the Movie :");
			movie=sc.nextInt();
			
			switch(movie) {
			case 1:
				System.out.println("Vikram is an Blockbuster Hit Movie");
				break;
			case 2:
				System.out.println("Thevar Magan is an Blockbuster Hit Movie");
				break;
			case 3:
				System.out.println("Guna is an Blockbuster Hit Movie");
				break;
			case 4:
				System.out.println("Samasya is not an Blockbuster Hit Movie");
				break;
			case 5:
				System.out.println("Thiruvonam is not an Blockbuster Hit Movie");
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