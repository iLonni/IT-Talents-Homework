import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstWord = sc.next();
		String secondWord = sc.next();		
		int minLength = firstWord.length();

		if (firstWord.length() > secondWord.length()) {
			System.out.println("The length of the first word is > than the length of the second word!");
			minLength = secondWord.length();
		} 
		else {
			if (firstWord.length() < secondWord.length()) {
				System.out.println("The length of the first word is < than the length of the second word!");
				minLength = firstWord.length();
			} 
			else {
				System.out.println("The lengths of the words are equal");
			}
		}	
		boolean differenceInIndexes = false;
		int[] newArr = new int[minLength]; // we'll keep the indexes in this array
		int index = 0;
		int lengthOfNewArr = 0;
		for (int i = 0; i < minLength; i++) {
			if (firstWord.charAt(i) != secondWord.charAt(i)) {
				newArr[index] = i;
				index++;
				lengthOfNewArr++;
			}
			else {
				continue;
			}
		}
		for (int i = 0; i < minLength; i++) {
			if (firstWord.charAt(i) != secondWord.charAt(i)) {
				differenceInIndexes = true;
				break;
			}
			else {
				differenceInIndexes = false;
			}
		}
		for (int i = 0; i < lengthOfNewArr; i++) {
			if (differenceInIndexes) {
				System.out.println((newArr[i] + 1) + " " + firstWord.charAt(newArr[i]) + " - " + secondWord.charAt(newArr[i]));
			}
			else {
				System.out.println("There isn't a difference in the indexes");
			}
		}
		
		
	}
}
