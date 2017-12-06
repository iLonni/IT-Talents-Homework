import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		int number1 = sc.nextInt();
		System.out.println("Please enter your second number: ");
		int number2 = sc.nextInt();
		if (number1 != number2) {
			if (number1 < number2) {
				System.out.println(number1 + " " + number2);
			}
			else {
				System.out.println(number2 + " " + number1);
			}
		}
	}

}