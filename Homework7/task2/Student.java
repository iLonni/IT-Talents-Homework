package task2;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age) {
		this();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (subject != null && !subject.isEmpty()) {
			this.subject = subject;
		}
		if (age > 0) {
			this.age = age;
		}
	}
	
	void upYear() {
		if (!this.isDegree) {
			++this.yearInCollege;
		}
		if (this.yearInCollege >= 4) {
			this.isDegree = true;
			System.out.println("The student has already graduated.");
		}
	}
	
	double receiveScholarship(double min, double amount) {
		if (min >= 2 && min <= 6 && amount > 0) {
			if (this.grade >= min && this.age <= 30) {
				this.money += amount;
			}
		}
		return this.money;
	}
	
}
