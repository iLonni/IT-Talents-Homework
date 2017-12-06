
public class Task4 {

	public static void main(String[] args) {
		
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
					  };
		int[][] brr = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        brr[i][j] = arr[arr.length-j-1][i];
		    }
		}
		for (int i = 0; i < brr.length; i++) {
			 for (int j = 0; j < brr[i].length; j++) {	
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
