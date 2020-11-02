package RetestSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentCatalog implements Iterable<Student> {

    private ArrayList<Student> students;

    /**
     * Add a student in this studentCatalog.
     *
     * @param student Student arguments. The student you want to add in this studentCatalog.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Remove a student in this studentCatalog.
     *
     * @param student Student arguments. The student you want to Remove in this studentCatalog.
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * get the student you want in this studentCatalog.
     *
     * @param index int arguments. The index of the student you want to get in this studentCatalog.
     */
    public Student getStudent(int index) {
        return students.get(index);
    }

    /**
     * get the student you want in this studentCatalog.
     *
     * @param id String arguments. The id of the student you want to get in this studentCatalog.
     */
    public Student getStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id))
                return student;
        }
        return null;
    }

    /**
     * get the number of the students you want in this studentCatalog.
     */
    public int getNumberOfStudents() {
        return students.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}
