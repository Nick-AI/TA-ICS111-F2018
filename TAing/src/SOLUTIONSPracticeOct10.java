public class SOLUTIONSPracticeOct10 {

    public static void main(String[] args){
        //download the Student and CollegeClass classes, you'll need them

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
    }
}
