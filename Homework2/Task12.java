
public class Task12 {

	public static void main(String[] args) {
		
		int firstDigit, 
			secondDigit,
			thirdDigit;	
		for (int i = 100; i <= 999; i++) {
			firstDigit = i / 100;
			secondDigit = (i / 10) % 10;
			thirdDigit = i % 10; 
			if(firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.println(i);
			}
		}
	}

}
