import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt(),
			sum = 0,
			i = 1;
		do{
			sum += i;
			i++;
		} while(i <= number);
		System.out.println("The sum is: " + sum);

	}

}
