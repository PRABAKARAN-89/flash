class Student {
	public int rollNumber;
	public String studentName;
	Student() {
		
	}
}

class UGStudent extends Student {
	UGStudent(int rollNumber, String studentName){
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
}

class PGStudent extends Student {
	PGStudent() {
		super();

	}
}

class LocalStudent extends UGStudent{
	LocalStudent(int rollNumber, String studentName){
		super(rollNumber, studentName);

	}
}

class NonLocalStudent extends UGStudent {
	NonLocalStudent(int rollNumber, String studentName) {
		super(rollNumber, studentName);

	}
}

public class StudentMain {

	public static void main(String[] args) {
		LocalStudent stud1 = new LocalStudent(1,"Jagath");
		LocalStudent stud2 = new LocalStudent(2,"Kishore");
		LocalStudent stud3 = new LocalStudent(3,"Rakshan");
		LocalStudent stud4 = new LocalStudent(4,"Prabu");
		LocalStudent stud5 = new LocalStudent(5,"Jai");
		
		System.out.println(stud1.rollNumber + "," +stud1.studentName);
		System.out.println(stud2.rollNumber + "," +stud2.studentName);
		System.out.println(stud3.rollNumber + "," +stud3.studentName);
		System.out.println(stud4.rollNumber + "," +stud4.studentName);
		System.out.println(stud5.rollNumber + "," +stud5.studentName);
		
		
	}

}
