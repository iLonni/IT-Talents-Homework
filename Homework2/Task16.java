import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter m: ");
		int m = sc.nextInt();
		if (n >= 10 && n <= 5555 && n >= 10 && n <= 5555) {
			if (n > m) {
				int temp = n;
				n = m;
				m =temp;
			}
			for (int i = m; i >= n; i--) {
				if (i % 50 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
