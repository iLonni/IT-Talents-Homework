import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the first array: ");
		int size1 = sc.nextInt();
		int[] arr = new int[size1];
		System.out.print("Please enter your first array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Size of the second array: ");
		int size2 = sc.nextInt();
		int[] brr = new int[size2];
		System.out.print("Please enter your second array: ");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		
		boolean isEqual = true; 
		if (size1 == size2) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == brr[i]) {
					isEqual = true;
				}
				else {
					isEqual = false;
				}
			}
		}
		else {
			System.out.println("The size of the arrays is different.");
		}
		
		if (isEqual) {
			System.out.println("The content of the arrays is equal.");
		}
		else {
			System.out.println("The content of the arrays is different.");
		}

	}

}
