import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three-digit number: ");
		int number = sc.nextInt();
		int firstDigit = number / 100,
			secondDigit = (number / 10) % 10,
			thirdDigit = number % 10;
		
		if (firstDigit == secondDigit && secondDigit == thirdDigit) {
			System.out.println("The digits are equal.");
		}
		else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
			System.out.println("The digits are in descending order.");
		}
		else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
			System.out.println("The digits are in ascending order.");
		}
		else {
			System.out.println("The digits are not ordered.");
		}
			
	}

}
