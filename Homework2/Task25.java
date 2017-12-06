import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int number= sc.nextInt(); 
		int product = 1;
		if (number == 0) {
			System.out.println("n! = " + 1);
		}
		else {
			do {
				product = product*number;
				number--;
			
			} while(number!= 0);
				System.out.println("n! = " + product);
		}
	}

}
