package AllProgramming;

public class Task3_2 {

	public static void main(String[] args) {
		
		System.out.println("The Even Numbers are: ");
		
		for (int i=1;i<=100;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		System.out.println("The Odd Numbers are: ");
		
		for (int j=1;j<=100;j++) {
		
			if(j%2==1) {
				System.out.println(j);
			}
		}
		
	}
}