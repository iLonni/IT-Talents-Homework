import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a four-digit number: ");
		int number = sc.nextInt();
		
		if (number >= 1000 && number <= 9999) {
			int firstDigit = number / 1000;
			int secondDigit = (number / 100) % 10;
			int thirdDigit = (number / 10) % 10;
			int fourthDigit = number % 10;
			int firstNewNumber = firstDigit * 10 + fourthDigit;
			int secondNewNumber = secondDigit * 10 + thirdDigit;
			
			if (firstNewNumber < secondNewNumber) {
				System.out.println(firstNewNumber + " is < " + secondNewNumber);
			}
			else if (firstNewNumber > secondNewNumber) {
				System.out.println(firstNewNumber + " is > " + secondNewNumber);
			}
			else {
				System.out.println(firstNewNumber + " = " + secondNewNumber);
			}
		}
	}
}