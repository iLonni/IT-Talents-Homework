import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the array: ");
		int size1 = sc.nextInt();
		int[] arr = new int[size1];
		System.out.print("Please enter the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] brr = new int[size1];
		brr[0] = arr[0];
		brr[arr.length - 1] = arr[arr.length - 1];
		
		for (int i = 1 ; i < arr.length - 1; i++) {
			brr[i] = arr[i-1] + arr[i+1];
		}
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
