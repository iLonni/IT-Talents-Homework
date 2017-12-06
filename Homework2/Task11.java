import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		for(int row=0 ; row < number; row++) {
			for(int spaces=0; spaces < number-row-1; spaces++){
				System.out.print(" ");
			}
			for(int stars = 0; stars < (2*row +1); stars++){
			System.out.print("*");
			}
		System.out.println();
		}
		
	}

}
