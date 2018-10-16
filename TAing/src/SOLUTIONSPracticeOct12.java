public class SOLUTIONSPracticeOct12 {

    public static void main(String[] args){
        //Fill in your "Student" class from last lab if you haven't yet, you can use SOLUTIONSStudent.java from 
        //tinyurl.com/ICS111-Practice

        //creating a new object of the class CollegeClass
        CollegeClass ics111 = new CollegeClass();

        //specify the name of the class (Intro to Java/ Computer Science/ Programming?) and how many credits its worth
        ics111.specifyClass("ICS 111", 4);

        //set the maximum size of the class
        ics111.setClassSize(100);

        //Complete the Student class
        Student s = new Student();

        //set the student's name and student id
        s.setName("Bob");
        s.setIdNumber(12345);

        //add the student to your class
        ics111.addStudent(s);

        //print out the class list
        Student[] classL = ics111.getStudentList();
        for(Student stud: classL){
            if(stud != null)
                System.out.println(stud.getName());
        }
        
        //complete the "Employee" class according to the comments
        
        //add an instance variable to the "CollegeClass" class of the class "Employee" that is called instructor
        
        //add a method to CollegeClass to set the class instructor
        
        //create a new employee object and set the instructor of ics111 to that employee
        Employee icsInst = new Employee("Somebody", 1);
        ics111.setInstructor(icsInst);
        //set the employee object's salary to some value of your choosing
        icsInst.setSalary(100000.00);
    }
}
