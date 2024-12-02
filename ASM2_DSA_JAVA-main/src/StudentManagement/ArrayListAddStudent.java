package StudentManagement;

import java.util.ArrayList;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData) {
        try {
            students.add(objectData);
        } catch (Exception e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
}