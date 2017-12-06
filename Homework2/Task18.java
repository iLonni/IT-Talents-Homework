import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first number: ");
		int number1 = sc.nextInt();
		System.out.println("Please enter your second number: ");
		int number2 = sc.nextInt();
		if (number1 >= 1 && number1 <= 9 && number2 >= 1 && number2 <= 9) {
			for (int i = 1; i <= number1; i++) {
				for (int j = 1; j <= number2; j++) {
						System.out.println(i + "*" + j + " = " + i * j);
				}
			}
		}
		else {
			System.out.println("Incorrect input!");
		}
	}

}
