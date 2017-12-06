import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 52: ");
		int number = sc.nextInt();
		for (int card = number; card <= 52; card ++) {
			int cardNumber = (card - 1) / (4 + 1);
			int cardSuit = card % 4;
			
			switch (cardNumber) {
				case 1:
					System.out.print("Dvoika");
					break;
				case 2:
					System.out.print("Troika");
					break;
				case 3:
					System.out.print("Chetvorka");
					break;
				case 4:
					System.out.print("Petitsa");
					break;
				case 5:
					System.out.print("Shestitsa");
					break;
				case 6:
					System.out.print("Sedmitsa");
					break;
				case 7:
					System.out.print("Osmitsa");
					break;
				case 8:
					System.out.print("Devetka");
					break;
				case 9:
					System.out.print("Desetka");
					break;
				case 10:
					System.out.print("Vale");
					break;
				case 11:
					System.out.print("Dama");
					break;
				case 12:
					System.out.print("Pop");
					break;
				case 13:
					System.out.print("Aso");
					break;
			}
			System.out.print(" ");
			
			switch (cardSuit) {
				case 1:
					System.out.print("spatia");
					break;
				case 2:
					System.out.print("karo");
					break;
				case 3:
					System.out.print("kupa");
					break;
				case 0:
					System.out.print("pika");
					break;
			}
			
			if (card < 52) {
				System.out.print(", ");
			}
			
		}

	}

}
