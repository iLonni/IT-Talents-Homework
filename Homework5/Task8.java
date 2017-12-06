import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String ourString = sc.next();
		
		boolean isPalindrome = true;
		int temp = ourString.length() - 1;		
		for (int i = 0; i <= temp; i++)
			if (ourString.charAt(i) != ourString.charAt(temp)) {
				isPalindrome = false;
				break;
			}
			else {
				temp--;
			}
		if (isPalindrome) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
