import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter capacity: ");
		int capacity = sc.nextInt();
		int firstBucketCapacity = 2,
		    secondBucketCapacity = 3;
		
		if (capacity < 10 || capacity > 9999) {
			System.out.println("Incorrect input!");
		}
			
		else {
			int division = capacity / (firstBucketCapacity + secondBucketCapacity), // 107 / 5 = 21
				remainder = capacity % (firstBucketCapacity + secondBucketCapacity); // 107 % 5 = 2
			
			if (remainder == 0) {
				System.out.println(division + " x " + firstBucketCapacity + "L");
				System.out.println(division + " x " + secondBucketCapacity + "L");
			}
			else if (remainder == 2) {
				System.out.println(division + " x " + firstBucketCapacity + "L");
				System.out.println(division + " x " + secondBucketCapacity + "L");
				System.out.println("Extra: 1 x " + firstBucketCapacity + "L");
			}
			else if (remainder == 3) {
				System.out.println(division + " x " + firstBucketCapacity + "L");
				System.out.println(division + " x " + secondBucketCapacity + "L");
				System.out.println("Extra: 1 x " + secondBucketCapacity + "L");
			}
			else if (remainder == 4) {
				System.out.println(division + " x " + firstBucketCapacity + "L");
				System.out.println(division + " x " + secondBucketCapacity + "L");
				System.out.println("Extra: 2 x " + firstBucketCapacity + "L");	
			}
			else {
				System.out.println((--division) + " x " + firstBucketCapacity + "L" );
				System.out.println((++division) + " x " + secondBucketCapacity + "L" );
			}
		}

	}

}
