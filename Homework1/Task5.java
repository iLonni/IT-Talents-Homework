import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		int number1 = sc.nextInt();
		System.out.println("Please enter your second number: ");
		int number2 = sc.nextInt();
		System.out.println("Please enter your third number: ");
	    int number3 = sc.nextInt();
	    
	    if(number1 != number2 && number2 != number3 && number1 != number3) {
	    	if (number1 > number2) {
	    		if (number2 > number3) {
	    			System.out.println(number1 + " " + number2 + " " + number3);
	    		}
	    		else {
	    		    if (number1 > number3) {
	    		    	System.out.println(number1 + " " + number3 + " " + number2);
	    		    }
	    		    else {
	    		    	System.out.println(number3 + " " + number1 + " " + number2);
	    		    }
                }
	    	}
	    	else {
	    		if (number2 > number3) {
                   if (number1 > number3) {
                	   System.out.println(number2 + " " + number1 + " " + number3);
                   }
                   else {
                	   System.out.println(number2 + " " + number3 + " " + number1);
                   }
                }
	    	    else {
	    	    	System.out.println(number3 + " " + number2 + " " + number1);
	    	    }
	    	}
	    }
	    
	}

}
