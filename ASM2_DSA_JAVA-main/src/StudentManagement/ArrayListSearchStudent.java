package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListSearchStudent {
    public int binarySearch(ArrayList<Student> students, String id) {
        try {
            if (students.isEmpty()) {
                throw new Exception("Student list is empty.");
            }
            int left = 0;
            int right = students.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (Objects.equals(students.get(mid).id, id)) {
                    return mid;
                }
                int compareStr = students.get(mid).id.compareToIgnoreCase(id);
                if (compareStr < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1; // Not found
        } catch (Exception e) {
            System.out.println("Error searching for student: " + e.getMessage());
            return -1; // Indicate error
        }
    }
}