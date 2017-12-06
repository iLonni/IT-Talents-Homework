import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if (number >= 10 && number <= 200) {
			while (number > 0) {
				if (number % 7 == 0) {
				System.out.println(number);
				}
				number--;
			}
		}

	}

}
