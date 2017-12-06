import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your first string: ");
		String firstString = sc.next();
		System.out.println("Please enter your second string: ");
		String secondString = sc.next();
		
		System.out.println(firstString.toUpperCase() + " " + firstString.toLowerCase());
		System.out.println(secondString.toUpperCase() + " " + secondString.toLowerCase());

	}

}
