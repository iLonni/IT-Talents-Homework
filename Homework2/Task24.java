import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Please enter a number: ");
		 int number = sc.nextInt(); 
		 if (number >= 10 && number <= 30_000) {
			 int reversedNumber = 0;
			 int copyOfNumber = number;
			 do {
				int remainder = number % 10;
				reversedNumber = reversedNumber*10 + remainder;
				number /= 10;
			 } while (number != 0);
			 if (reversedNumber == copyOfNumber) {
				 System.out.println(copyOfNumber + " is a palindrome.");
			 }
			 else {
				 System.out.println(copyOfNumber + " isn't a palindrome.");
			 }
		 }
		 else {
			 System.out.println("Incorrect input!");
		 }
	}

}
