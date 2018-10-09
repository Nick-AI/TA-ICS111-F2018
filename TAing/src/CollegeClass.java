public class CollegeClass {

	public Student[] students;
	String title;
	int maxStudents;
	int credits;
	int classSize = 0;
	
	public void setClassSize(int numStudents){
		students = new Student[numStudents];
		maxStudents = numStudents;
	}
	
	public void addStudent(Student s){
		students[classSize] = s;
		classSize++;
	}
	
	public Student[] getStudentList(){
		return students;
	}
	
	public void specifyClass(String name, int credits){
		title = name;
		this.credits = credits;
	}
}
