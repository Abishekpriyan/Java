package AllProgramming;

public class ArrayTask4 {

	public static void main(String[] args) {

		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = new int[10];
		
		System.out.print("The Copied Elements are ");
		
		for(int i = 0;i < array1.length;i++) {
			array2[i] = array1[i];
			System.out.print(array2[i] + " ");
		}
	}
}