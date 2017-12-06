import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your array: ");
	    int[][] arr = new int[6][6];
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
		}
	    int sumOfElements = 0,
	    	sumOfEachEvenRow = 0;
	    for (int i = 1; i < arr.length; i += 2) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		System.out.print(arr[i][j] + " ");
	    		sumOfEachEvenRow += arr[i][j];
	    	}
	    	System.out.println("Sum of " + (i+1) + " row: " + sumOfEachEvenRow);
	    	sumOfElements += sumOfEachEvenRow;
	    	sumOfEachEvenRow = 0;
	    }
	    
		System.out.println("The sum of all elements: " + sumOfElements);

	}

}


