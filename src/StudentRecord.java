import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    public static void main(String[] args) {

        List<StudentRecord> students = new ArrayList<>();


        StudentRecord student1 = new StudentRecord("12345", "John", "Doe", 20, "Computer Science");
        StudentRecord student2 = new StudentRecord("23456", "Jane", "Smith", 21, "Mathematics");
        StudentRecord student3 = new StudentRecord("34567", "Bob", "Johnson", 19, "Physics");


        students.add(student1);
        students.add(student2);
        students.add(student3);


        for (StudentRecord student : students) {
            System.out.println(student);
        }


        StudentRecord updatedStudent1 = new StudentRecord(student1.studentId(), student1.firstName(), student1.lastName(), student1.age(), "Data Science");

    }
}
