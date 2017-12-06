package task2;

public class StudentGroup {
	
	String groupSubject;
	Student[] students;
	int freePlaces;
	int currentSize;
	
	StudentGroup() {
		this.currentSize = 5;
		this.students = new Student[this.currentSize];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		if (subject != null && !subject.isEmpty()) {
			this.groupSubject = subject;
		}
	}
	
	void addStudent(Student s) {
		if (s.subject.equals(this.groupSubject) && freePlaces >= 1) {
			students[5-this.freePlaces] = s;
			--this.freePlaces;
		}
	}
	
	void emptyGroup() {
		this.currentSize = 5;
		this.students = new Student[this.currentSize];
		this.freePlaces = 5;
	}
	
	String theBestStudent() {
		double max = students[0].grade;
		int indexOfTheBestStudent = 0;
		for (int i = 0; i < students.length; i++) {	
			if(students[i].grade > max){
				max = students[i].grade;
				indexOfTheBestStudent = i;
			}		
		}
		return students[indexOfTheBestStudent].name;
	}
	
	public void printStudentsInGroup() {	
		for (int i = 0; i < students.length; i++) {
			System.out.println("Number of the student: " + (i+1));
			System.out.println("Name of the student: " + students[i].name);
			System.out.println("Subject: " + students[i].subject);
			System.out.println("Grade of student: " + students[i].grade);
			System.out.println("Age of the student: " + students[i].age);
			System.out.println("Year in college: " + students[i].yearInCollege);
			System.out.println("Money from scholarships: " + students[i].money);
		}
	}
}
