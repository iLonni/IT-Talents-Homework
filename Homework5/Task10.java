import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = sc.nextLine();
		for (int i = 0; i < word.length(); i++) {
			char newLetter = (char) (word.charAt(i) + 5);
			System.out.print(newLetter);
		}
		System.out.println();
		
	}
}
