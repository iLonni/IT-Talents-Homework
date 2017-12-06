import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		double[] arr = new double[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}
