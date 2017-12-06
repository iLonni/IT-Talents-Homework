import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("Please enter a number: ");
		 int n = sc.nextInt();
		 int counter = 0;
		 int number = 3;
		 while (counter != n) {
			 if (number %3 == 0) {
				 if (counter == n-1){
					 System.out.print(number);
				 }
				 else {
				 System.out.print(number + ", ");
				 number++;
				 }
				 counter++;
			 }
			 else number++;
		 }
	}

}
