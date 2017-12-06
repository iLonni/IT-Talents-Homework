import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a temperature: ");
		byte temperature = sc.nextByte();
		if (temperature < -20) {
			System.out.println("It's freezing cold!");
		}
		else if (temperature >= -20 && temperature < 0) {
			System.out.println("It's cold.");
		}
		else if (temperature >= 0 && temperature < 15) {
			System.out.println("It's chilly.");
		}
		else if (temperature >= 15 && temperature < 25) {
			System.out.println("It's warm.");
		}
		else {
			System.out.println("It's hot.");
		}
	}

}