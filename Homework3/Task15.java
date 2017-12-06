import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array: ");
		int size = sc.nextInt();
		double[] arr = new double[size];
		System.out.print("Please enter an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		double maxNumber1 = 0,
	     	   maxNumber2 = 0,
	     	   maxNumber3 = 0;
		int maxIndex1 = 0, 
			maxIndex2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > Math.abs(maxNumber1)) {
				maxNumber1 = arr[i];
				maxIndex1 = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != maxIndex1) {
				if (Math.abs(arr[i]) > Math.abs(maxNumber2)) {
					maxNumber2 = arr[i];
					maxIndex2 = i;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != maxIndex1 && i != maxIndex2) {
				if (Math.abs(arr[i]) > Math.abs(maxNumber3)) {
					maxNumber3 = arr[i];
				}
			}
		}
		System.out.println("The elements with max sum are: " + maxNumber1 + " " + maxNumber2 + " " + maxNumber3);
	}

}
