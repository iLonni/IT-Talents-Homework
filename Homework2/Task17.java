import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number(between 3 and 20): ");
		int b = sc.nextInt();
		System.out.println("Please enter a symbol: ");
		char c = sc.next().charAt(0);
		
		if (b >= 3 && b <= 20) {
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < b; j++) {
					if (j == (b - 1)) {
						System.out.print("*");
						System.out.println();
						} 
					else {
						if (i == 0 || i == (b - 1) || j == 0 ) {
							System.out.print("*");
						}
						else {
							System.out.print(c);
						}
					}
				}
			}
		}
		else {
			System.out.println("Incorrect input!");
		}
	}

}
