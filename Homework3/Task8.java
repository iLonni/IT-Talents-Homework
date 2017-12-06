import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of your array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int element = arr[0],
		    counter = 1, 
		    max = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				counter++;
				if (counter > max) {
					max = counter;
					element = arr[i];
				}
			} 	
			else {
				counter = 1;
			}
		}
		while (max > 0) {
			max--; 
			System.out.print(element + " ");
		}
	

	}

}
