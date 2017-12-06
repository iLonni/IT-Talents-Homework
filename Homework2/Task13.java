import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number >= 2 && number <= 27) {
			int firstDigit, 
			secondDigit,
			thirdDigit;	
			for (int i = 100; i <= 999; i++) {
				firstDigit = i / 100;
				secondDigit = (i / 10) % 10;
				thirdDigit = i % 10; 	
				if(firstDigit + secondDigit+ thirdDigit == number) {
					System.out.println(i);
				}		
			}
		}

	}
}
