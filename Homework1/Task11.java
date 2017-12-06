import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three digit number: ");
		int number = sc.nextShort();
		int firstDigit = number / 100,
			secondDigit = (number / 10) % 10,
			thirdDigit = number % 10;
		
		if ((firstDigit != 0) && (secondDigit != 0) && (thirdDigit != 0)) {
			boolean divides = true;
			if ((number % firstDigit == 0) && (number % secondDigit == 0) && (number % thirdDigit == 0)) {
				divides = true;
			}
			else {
				divides = false;
			}
			System.out.println(divides);
		}
		else {
			System.out.println("Incorrect input!");
		}
	}

}
