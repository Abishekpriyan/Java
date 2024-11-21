package AllProgramming;
import java.util.Scanner;

public class Weekdays {

	enum course{JAVA,AI,ML}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Passing array into enum
		course[] presentcourse = course.values();
		
		System.out.println("Enter the number to select the course :");
		//for(course c: presentcourse)
		for(int i=0 ; i < presentcourse.length ; i++){
			System.out.println(i+": "+ presentcourse[i]);
		}
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		if (choice >= 0 && choice < presentcourse.length) 
		{
        	course selectedCourse = presentcourse[choice];
		        
			switch(selectedCourse)
			{
			
			case JAVA:
				System.out.println("Java is always Powerful");
				break;
			
			case AI:
				System.out.println("AI Leads to Impact");
				break;
		
			case ML:
				System.out.println("ML Leads to DataAnalysis");
				break;
			}
		}else {
			System.out.println("Enter a valid number.");
		}
		
		sc.close();
	}
}