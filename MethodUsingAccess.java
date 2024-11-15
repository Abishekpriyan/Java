package AllProgramming;

public class MethodUsingAccess {

		public void display() {
				System.out.println("Method using Public");	
		}
		
		public void display1(int a) {
			System.out.println("Method using pulic thru Parameter");
		}

		public static void main(String[] args) {
			MethodUsingAccess obj=new MethodUsingAccess();
			obj.display();
			obj.display1(25);
		}
	}