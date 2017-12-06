import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		
		int temp = number;
		int digits = 0;
		
		while (temp != 0) {
			temp = temp / 2;
			digits ++;
		}
		
		if (digits == 0) {
			digits = 1;
		}
		
		int[] arr = new int[digits];
		for (int i = digits - 1; i >= 0; i--) {
			int digit = number % 2;
			arr[i] = digit;
			number = number / 2;
		}
		for (int i = 0; i < digits; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
