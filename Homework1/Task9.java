import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two two-digit numbers:");
		int number1 = sc.nextInt(),
			number2 = sc.nextInt();
		if ((number1 >= 10 && number1 <= 99) && (number1 >= 10 && number1 <= 99)) {
			boolean even = true;
			if (((number1 * number2) % 10) % 2 == 0) {
				even = true;
			}
			else {
				even = false;
			}
			
			if (even) {
				System.out.println((number1*number2) + ", " + ((number1 * number2) % 10) + ", even");
			}
			else {
				System.out.println((number1*number2) + ", " + ((number1 * number2) % 10) + ", odd");
			}
		}
	}

}
