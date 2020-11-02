package RetestSystem;

/**
 * This class represent a student.
 */
public class Student {

    private String id;
    private String name;
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

    public void setExamPaper(ExamPaper initial_examPaper) {
        this.examPaper = initial_examPaper;
    }

    /**
     * Get the id of a student object
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name of a student object
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the ExamPaper of a student object
     */
    public ExamPaper getExamPaper() {
        //TODO
        if (examPaper == null) {

            return null;
        }
        return examPaper;
    }

}
