package RetestSystem.Strategy;

import RetestSystem.Base.*;

/**
 * Format the students
 */
public interface StudentsFormatter {

    /**
     * Format the students
     *
     * @param studentCatalog the student catalog needs to be formatted.
     * @return the formatted students.
     */
    String formatStudents(StudentCatalog studentCatalog);
}
