import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hour: ");
		double hour = sc.nextDouble();
		System.out.println("Money: ");
		double money = sc.nextDouble();
		System.out.println("Am I healthy?");
		boolean isHealthy = sc.nextBoolean();
		
		if (isHealthy == false) {	
			//System.out.println("I'm sick. I'm not going out today!");
			if (money > 0) {
				System.out.println("I'm sick. I'm not going out today! I'm going to buy medicines.");
			}
			else {
				System.out.println("I'm sick. I'm not going out today! I'm going to stay stay at home and drink tea.");
			}
		}
		else {
			if (money >= 10) {
			System.out.println("I'm healthy. I'm going to the cinema with friends");
			}
			else {
				System.out.println("I'm healthy. I'm going to the cafe.");
			}
		}
		
	}
}