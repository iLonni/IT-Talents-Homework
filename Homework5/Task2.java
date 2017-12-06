import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstWord = sc.next();
		String secondWord = sc.next();
		
		System.out.print(findLongestWord(firstWord, secondWord).length() + " ");
		
		String newFirstWord = firstWord.substring(0,5);
		String newSecondWord = secondWord.substring(0,5);
		
		if (findLongestWord(firstWord, secondWord).equals(firstWord)) {
			System.out.println(newSecondWord + firstWord.substring(5));
		}
		else {
			System.out.println(newFirstWord + secondWord.substring(5));
		}
		
	}
	
	static String findLongestWord (String word1, String word2) {
		if (word2.length() > word1.length()) {
			return word2;
		}
		else {
			return word1;
		}
	}
}

