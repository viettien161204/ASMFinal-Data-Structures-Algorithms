package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemoveStudent {
    public void removeStudentById(ArrayList<Student> students, String id) {
        try {
            boolean found = false;
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(students.get(i).id, id)) {
                    students.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new Exception("Student with ID " + id + " not found.");
            }
        } catch (Exception e) {
            System.out.println("Error removing student: " + e.getMessage());
        }
    }
}