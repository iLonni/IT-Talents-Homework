import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Please enter your first number: ");
		 int number1 = sc.nextInt();
		 System.out.print("Please enter yout second number: ");
		 int number2 = sc.nextInt();
			
		 if (number1 > number2) {
			 int temp = number1;
			 number1 = number2;
			 number2 = temp;
		 }
		 for (int i = number1; i <= number2; i++) {
			 System.out.print(i + " ");
		 }
			 

	}

}
