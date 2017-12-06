import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] brr = new int[size];
		for (int i = 0; i < arr.length / 2; i++) {
			brr[i] = arr[i];
		}
		int resultIndex = arr.length / 2;
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			brr[resultIndex] = arr[i];
			resultIndex ++;
		}
		System.out.print("The elements of the second array are: ");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}
}