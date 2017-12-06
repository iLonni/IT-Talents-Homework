import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x1 = ");
		int x1 = sc.nextInt();
		System.out.println("y1 = ");
		int y1 = sc.nextInt();
		System.out.println("x2 = ");
		int x2 = sc.nextInt();
		System.out.println("y2 = ");
		int y2 = sc.nextInt();
	    
	    boolean equal = false;
	
	    if (x1 < 1 || x1 > 8 || x2 < 1 || x2 > 8 || y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8) {
	    	System.out.println("Incorrect input!");
	    }
	    else {
	        if ((x1 == y1) && (x2 == y2)) {
	            equal= true;
	        }
	        else if ( ( ((x1 % 2 == 0) && (y1 % 2 == 0)) || ((x1 % 2 != 0) && (y1 % 2 != 0)) ) &&
	                  ( ((x2 % 2 == 0) && (y2 % 2 == 0)) || ((x2 % 2 != 0) && (y2 % 2 != 0)) ) ) {
	        	equal = true;
	        }
	        else if ( ( ((x1 % 2 == 0) && (y1 % 2 != 0)) || ((x1 % 2 != 0) && (y1 % 2 == 0)) ) &&
	                  ( ((x2 % 2 == 0) && (y2 % 2 != 0)) || ((x2 % 2 != 0) && (y2 % 2 == 0)) ) ) {
                 equal = true;
	        }
	        else {
	            equal = false;
	        }
	        
	        if (equal) {
	        	System.out.println("The colours are equal.");
	        }
	        else {
	        	System.out.println("The colours are different.");
	        }
	    }
	}

}
