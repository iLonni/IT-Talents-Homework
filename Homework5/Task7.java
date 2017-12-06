import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String ourString = sc.nextLine();
		String[] words = ourString.split(" ");
		System.out.println(words.length + " words");
		
		String longestWord = words[0];
		for (int i = 1; i < words.length; i++) {	
			if (words[i].length() > longestWord.length()) {
				longestWord = words[i];				
			}			
		}	
		System.out.println("The longest word has " + longestWord.length() + " symbols.");

	}

}
