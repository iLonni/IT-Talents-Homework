import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean isMirror = false;
		int currentIndex = arr.length - 1;
		for (int i = 0; i <= currentIndex; i++) {
			if (arr[i] == arr[currentIndex]) {
				isMirror = true;
			}
			else {
				break;
			}
			currentIndex--;
		}
		if (isMirror) {
			System.out.println("Mirror image!");
		}
		else {
			System.out.println("Not mirror image!");
		}
	}

}
