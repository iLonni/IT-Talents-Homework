import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		if (number >= 10 && number <= 99) {
			int previous = number;
			int next = 0;
			while(previous > 1){	
				if(previous % 2 == 0){	
					next = (int)(0.5*previous);
				}
				else{
					next = 3*previous + 1;
				}
				System.out.print(next + " ");	
				previous = next;
			}
		}
		else {
			System.out.println("Incorrect input!");
		}
		
	}

}
