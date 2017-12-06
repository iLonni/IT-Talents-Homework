import java.util.Scanner;

public class Task18 {

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
		
		if (size1 == size2) {
			int[] crr = new int[size1];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > brr[i]) {
					crr[i] = arr[i];
				} else {
					crr[i] = brr[i];
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < brr.length; i++) {
				System.out.print(brr[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < crr.length; i++) {
				System.out.print(crr[i] + " ");
			}
			System.out.println();
		}
		else {
			System.out.print("The sizes of the arrays are different.");
		}
	}

}
