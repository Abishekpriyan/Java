package AllProgramming;

public class ArrayTask1 {

	public static void main(String[] args) {
		System.out.println("To Print the Reverse the Number Order from 20 to 1 without using Builtin Functions in the Array.");
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.print("The Reversed Order is : ");
		for (int i = (num.length)-1; i>=0; i--) {
			System.out.print(num[i] + " ");
			
		}
	}
}