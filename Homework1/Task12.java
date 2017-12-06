import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Day: ");
		byte day = sc.nextByte();
		System.out.println("Month: ");
		byte month = sc.nextByte();
		System.out.println("Year: ");
		int year = sc.nextInt();
		
		if (day < 1 || day > 31) {
			System.out.println("Incorrect day!");
		}
		if (month < 1 || month > 12) {
			System.out.println("Incorrect month!");
		}	
		if (year < 1) {
			System.out.println("Incorrect year!");
		}
		
		boolean isLeapYear = true;
		
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			isLeapYear = true;
		}
		else {
			isLeapYear = false;	
		}
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: 
				if (day == 31) {
					System.out.println("The next day is 01." + (++month) + "." + year);
				}
				else {
					System.out.println("The next day is " + (++day) + "." + month + "." + year);
				}
				break;
				
			case 12:
				if (day == 31) {
					System.out.println("The next day is 01.01" + "." + (++year));
				}
				else {
					System.out.println("The next day is " + (++day) + "." + month + "." + year);
				}
				break;
			
			case 2: 
				if (day == 28 && isLeapYear) {
					System.out.println("The next day is " + (++day) + "." + month + "." + year);
				}
				else if (day == 28 && !isLeapYear){
					System.out.println("The next day is 01." + (++month) + "." + year);
				}
				else if (day == 29 && isLeapYear) {
					System.out.println("The next day is 01." + (++month) + "." + year);
				}
				else if (day < 28) {
					System.out.println("The next day is " + (++day) + "." + month + "." + year);
				}
				else {
					System.out.println("Invalid date!");
				}
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				if (day == 30) {
					System.out.println("The next day is 01." + (++month) + "." + year);
				}
				else if (day < 30) {
					System.out.println("The next day is" + (++day) + "." + month + "." + year);
				}
				else {
					System.out.println("Invalid date!");
				}
				break;
				
			default:
				System.out.println("Invalid date!");
				break;
		}
       
	}

}
