import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		double[] brr = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				brr[i] = (i + 1) * (i + 1) + 41.25;
			}
			else {
				brr[i] = arr[i] * (i + 1);
			}
		}
		
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println();

	}

}
