package task2;

public class College {

	public static void main(String[] args) {
	
		Student alex = new Student("Alex", "Computer Science", 19);
		Student angie = new Student("Angie", "Computer Science", 20);
		Student nati = new Student();
		
		angie.receiveScholarship(4.00, 120);
		alex.upYear();
		System.out.println(alex.yearInCollege);
		System.out.println(angie.money);
		
		StudentGroup compSci = new StudentGroup("Computer Science");
		compSci.addStudent(alex);
		compSci.addStudent(angie);
	
		System.out.println(compSci.theBestStudent());
	
	}
}
