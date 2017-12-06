import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Please enter a number: ");
		 int numberOfDigits = sc.nextInt(); 
		 int currentNumber = numberOfDigits-1;
		 int sizeOfNumber = numberOfDigits;
		 
		 for (int i = 0; i < sizeOfNumber; i++) {
			 if (numberOfDigits == 1) {
				 System.out.println(currentNumber);
			 }
			 else {
				 for (int j = 0; j < sizeOfNumber; j++) {
					 System.out.print(currentNumber);
				 }
				 System.out.println();
			 }
			 currentNumber += 2;
		 }	

	}

}
