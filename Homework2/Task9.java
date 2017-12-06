import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int a= sc.nextInt(); 
		System.out.print("B: ");
		int b= sc.nextInt(); 
		int sum = 0;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b && sum <= 200; i++) {
			if (i % 3 == 0) {
				System.out.print("skip " + i*i + ", ");
			}
			else {
				System.out.print(i * i + ", ");
				sum += i * i;
			}
		}
	}

}
