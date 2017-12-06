import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("Please enter a number: ");
		 int number = sc.nextInt();
		 int sum = 0;
		 for (int i = 1; i <= number; i++) {
			 sum += i;
		 }
		 System.out.println("The sum of the numbers from 1 to " + number + " is " + sum);
		
	}

}
