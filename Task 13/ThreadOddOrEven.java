package Task;

	class Odd extends Thread {
	
		public void run() {
			
			try {
				int num = 20;
					
				for(int i = 1; i <= num;i++) {
					if(i % 2 == 1) {
						System.out.println(i + " is a Odd Number.");
					}
				}
				System.out.println("");
			}
			catch(Exception e) {
				System.out.println("Exception is Caught");
			}
		}
	}

	class Even extends Thread {
	
		public void run() {
		
			try {
				int num = 20;
				for(int i = 1; i <= num;i++) {
					if(i % 2 == 0) {
						System.out.println(i + " is a Even Number.");
					}					
				}
				System.out.println("");
			}
			catch(Exception e) {
				System.out.println("Exception is Caught");
			}
		}
	}
	public class ThreadOddOrEven {
		public static void main(String[] args) {
		
			System.out.println("To print Odd and Even Numbers by using MultiThreading.");
			System.out.println("");
			Odd obj1 =new Odd();
			Even obj2 = new Even();
			obj1.start();
			obj2.start();
	}
}