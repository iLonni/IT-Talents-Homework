import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean zigzag = false;

		for (int i = 1; i < arr.length - 1; i++) {
			if (i % 2 == 1) {
				if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
					zigzag = true;
				}
				else {
					zigzag = false;
					break;
				}
			}
			else{
				if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
					zigzag = true;
				}
				else {
					zigzag = false;
					break;
				}
			}
		} 
		if (zigzag) {
			System.out.println("The row is zig-zag like.");
		} 
		else {
			System.out.println("The row is not zig-zag like.");
		}
	}

}
