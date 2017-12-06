import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} 
		
		double average = sum / arr.length;
		System.out.println("Average: " + average);
		
		double[] newArr = new double[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			double sub = arr[i] - average;
			double absSub = sub < 0 ? 0-sub : sub;
			newArr[i] = absSub;
		}
		double minSub = newArr[0];
		int minIndex = 0;
		for (int i = 1; i < newArr.length; i++) {
			if (minSub > newArr[i]) {
				minSub = newArr[i];
				minIndex = i;
			}
		}
		System.out.println("The element closest to this value: " + arr[minIndex]);
	}

}
