import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two two-digit numbers(int): ");
		int number1 = sc.nextInt(),
			number2 = sc.nextInt();
		
		System.out.println("Enter two two-digit numbers(double): ");
		double _number1 = sc.nextDouble(),
			   _number2 = sc.nextDouble();
		
		if (number1 != number2) {
			int sum = number1 + number2;
			int substract = number1 - number2;
			int product = number1 * number2;
			int division = number1 / number2;
			int modulo = number1 % number2;
			
			System.out.println("Result(int): ");
			System.out.println("Sum: " + sum);
			System.out.println("Substract: " + substract);
			System.out.println("Product: " + product);
			System.out.println("Division: " + division);
			System.out.println("Modulo: " + modulo);
		}

		if (_number1 != _number2) {
			double _sum = _number1 + _number2;
			double _substract = _number1 - _number2;
			double _product = _number1 * _number2;
			double _division = _number1 / _number2;
			double _modulo = _number1 % _number2;
			
			System.out.println("Result(double): ");
			System.out.println("Sum: " + _sum);
			System.out.println("Substract: " + _substract);
			System.out.println("Product: " + _product);
			System.out.println("Division: " + _division);
			System.out.println("Modulo: " + _modulo);
		}
	}

}

