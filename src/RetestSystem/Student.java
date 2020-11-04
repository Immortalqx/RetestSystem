package RetestSystem;

/**
 * This class represent a student.
 */
public class Student {

    private final String id;
    private final String name;
    private ExamPaper examPaper = null;

    /**
     * Constructs a <code>Student</code> object.
     *
     * @param initial_id   String arguments. Means a student's id.
     * @param initial_name String arguments. Means a student's name.
     */
    public Student(String initial_id, String initial_name) {
        this.id = initial_id;
        this.name = initial_name;
    }

    /**
     * Set the examPaper of a student object
     *
     * @param initial_examPaper ExamPaper arguments. Means a student's ExamPaper.
     */
    public void setExamPaper(ExamPaper initial_examPaper) {
        this.examPaper = initial_examPaper;
    }

    /**
     * Get the id of a student object
     *
     * @return the id of this student.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name of a student object
     *
     * @return the name of this student.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the ExamPaper of a student object
     *
     * @return the example of this student.
     */
    public ExamPaper getExamPaper() {
        return examPaper;
    }

}
