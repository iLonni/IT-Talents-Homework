
public class Task3 {

	public static void main(String[] args) {
		
	    int[][] arr = {
	    				{3, 4, 6},
	    				{5, 6, 8},
	    				{9, 10, 11},
	    				{18, 16, 15}
	    			  };

	    double sum = 0;
	    double average = 0;
	    double counter = 0;
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0 ; j < arr[i].length; j++) {
	    		sum += arr[i][j];
	    		counter ++;
	    	}
		}
	    average = sum / counter;
	    System.out.println("Sum: " + sum);
	    System.out.println("Average: " + average);

	}

}
