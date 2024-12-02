package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEditStudent {
    public void editStudent(ArrayList<Student> students, int position, Student object) {
        try {
            if (position < 0 || position >= students.size()) {
                throw new IndexOutOfBoundsException("Invalid position: " + position);
            }
            students.set(position, object);
        } catch (Exception e) {
            System.out.println("Error editing student: " + e.getMessage());
        }
    }

    public void editStudentById(ArrayList<Student> students, String id, Student data) {
        try {
            boolean found = false;
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(students.get(i).id, id)) {
                    students.set(i, data);
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new Exception("Student with ID " + id + " not found.");
            }
        } catch (Exception e) {
            System.out.println("Error editing student by ID: " + e.getMessage());
        }
    }
}