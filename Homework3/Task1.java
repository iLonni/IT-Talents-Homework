import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		if (min != 0) {
			System.out.print("The smallest number divided by 3 is " + min);
		}
		else {
			System.out.print("There isn't a number divided by 3.");
		}
	}

}
