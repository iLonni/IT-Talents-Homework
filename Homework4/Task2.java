import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter your array: ");
	    int[][] arr = new int[size][size];
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
		}
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		if (i == j) {
	    			System.out.print(arr[i][j] + " ");
	    		}
	    	}
		}
	    System.out.println();
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		 if (i + j == arr.length - 1) {
	    			System.out.print(arr[i][j] + " ");
	    		}
	    	}
		}

	}

}
