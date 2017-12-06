import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your array: ");
	    int[][] arr = new int[4][4];
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
		}
	    int sumOfRows = 0,
	    	sumOfColumns = 0,
	    	maxSumOfRows = 0,
	    	maxSumOfColumns = 0;
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumOfRows += arr[i][j];
				sumOfColumns += arr[i][j];
			}
			if (sumOfRows > maxSumOfRows) {
				maxSumOfRows = sumOfRows;
			}
			if (sumOfColumns > maxSumOfColumns) {
				maxSumOfColumns = sumOfColumns;
			}
			sumOfRows = 0;
			sumOfColumns = 0;
		}
	    
	    System.out.println("Max sum of rows: " + maxSumOfRows);
		System.out.println("Max sum of columns: " + maxSumOfColumns);
		
		if (maxSumOfColumns > maxSumOfRows) {
			System.out.println("The max sum of columns is > than the max sum of rows.");
		} 
		if (maxSumOfColumns < maxSumOfRows) {
			System.out.println("The max sum of columns is < than the max sum of rows.");	
		}
		else {
			System.out.println("The max sums are equal.");
		}
		
	}

}
