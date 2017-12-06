import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.print("Please enter 7 numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 5 && (arr[i] % 5 == 0)){
				System.out.print(arr[i] + " ");
				counter ++;
			}		
		}
		System.out.println("- " + counter + " numbers");
		
	}

}
