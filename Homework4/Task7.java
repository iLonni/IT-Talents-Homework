import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your array: ");
	    int[][] arr = new int[6][6];
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
		} 
	    int i = 0,
	    	j = 0,
	    	sumOfRow = 0, 
	    	sumOfElements = 0;  
		while(i <= arr.length - 1 || j <= arr[i].length - 1) {
			int sum = i + j;
			if (j == arr[i].length - 1) {	
				if(sum % 2 == 0) {
					System.out.println(arr[i][j] + " ");
					sumOfRow += arr[i][j];
				}		
				System.out.println(); 
				System.out.println("Sum of the elements on the " + i + " row: " + sumOfRow);	
				sumOfElements += sumOfRow; 
				sumOfRow = 0;
				i++;
				j = 0;
				sum = i + j;
				System.out.println();
			}	
			if(sum % 2 == 0) {
				System.out.print(arr[i][j] + " ");
				sumOfRow += arr[i][j];
			}
			j++;			
		}	
		System.out.println("The sum of all elements is: " + sumOfElements);

	}

}


