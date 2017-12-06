import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first name: ");
		String firstName = sc.nextLine();
		System.out.println("Please enter the second name");
		String secondName = sc.nextLine();
		
		int sumOfASCIICodesInFirstWord = 0,
			sumOfASCIICodesInSecondWord = 0;
		
		for (int i = 0; i < firstName.length(); i++) {
			sumOfASCIICodesInFirstWord += firstName.charAt(i);
		}
		for (int i = 0; i < secondName.length(); i++) {
			sumOfASCIICodesInSecondWord += secondName.charAt(i);
		}
		if (sumOfASCIICodesInFirstWord > sumOfASCIICodesInSecondWord) {
			System.out.println(firstName);
		}
		else {
			if (sumOfASCIICodesInFirstWord < sumOfASCIICodesInSecondWord) {
				System.out.println(secondName);
			} 
			else {
				System.out.println("The names are equal.");
			}
		}


	}

}
