import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;			
			}
		}
		if (isPrime) {
			System.out.println("The number " + number + " is prime");
		}
		else {
			System.out.println("The number " + number + " is not prime");
		}

	}

}
