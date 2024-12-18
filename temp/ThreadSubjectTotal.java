package Task;

class Subjects extends Thread {
	public void run() {
		try {
			float avg = 0;
			int tot = 0;
			int subject1 = 89;
			int subject2 = 84;
			int subject3 = 85;
			int subject4 = 90;
			int subject5 = 99;
			tot = (subject1 + subject2 + subject3 + subject4 + subject5);
			avg = tot/5;
			System.out.println("The Sum Total of all the Subjects = " + tot);
			System.out.println("The Average of all the Subjects = " + avg);
		}
		catch(Exception e) {
			System.out.println("Exception is Caught");
		}
	}
}
public class ThreadSubjectTotal {
	public static void main(String[] args) {
		Subjects obj = new Subjects();
		obj.start();
	}
}