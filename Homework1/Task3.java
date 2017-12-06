import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two different numbers: ");
		System.out.print("a= ");
		int number1 = sc.nextInt();
		System.out.print("b= ");
		int number2 = sc.nextInt();
		
		if(number1 != number2) {
			
			//Let's take 11(1011) and 13(1101).
			number1 = number1 ^ number2; // number1 = 1011 ^ 1101 = 0110
			number2 = number1 ^ number2; // number2 = 0110 ^ 1101 = 1011
			number1 = number1 ^ number2; // number1 = 0110 ^ 1011 = 1101
			System.out.println("a= " + number1);
			System.out.println("b= " + number2);
		}
		

	}

}

