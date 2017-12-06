import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Please enter a number: ");
		 int number = sc.nextInt();
		 if (number > 0 && number < 999) {
			 int currentNumber = number + 1;
			 int i = 0;
			 while (i < 10) {
				 if (currentNumber % 2 == 0 || currentNumber % 3 == 0 || currentNumber % 5 == 0)  {
				 ++i;
				 System.out.println(i + " : " + currentNumber);
				 }
			  currentNumber ++;
			 }
		 }
		 else {
			 System.out.println("Incorrect input!");
		 }
	}

}
