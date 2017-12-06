import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three different numbers: ");
		System.out.println("a= ");
		int number1 = sc.nextInt();
		System.out.println("b= ");
		int number2 = sc.nextInt();
		System.out.println("c= ");
		int number3 = sc.nextInt();
		
		int temp = number1;
		number1 = number2;
		number2 = number3;
		number3 = temp;
		
		System.out.println("a= " + number1);
		System.out.println("b= " + number2);
		System.out.println("c= " + number3);
	}

}