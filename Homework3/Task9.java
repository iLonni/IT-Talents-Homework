import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of your array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		int[] brr = new int[size];
		int currentIndex = arr.length - 1;
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[currentIndex];
			currentIndex--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (currentIndex > arr.length/2) {
				int temp = arr[i];
				arr[i] = arr[currentIndex];
				arr[i] = temp;
				currentIndex--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
