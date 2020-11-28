package RetestSystem.Base;

/**
 * This class implements a ProfessionalTest.
 */
public class ProfessionalTest extends Test {

    private String programInstruction;
    private String programming;
    private String photoURL;

    /**
     * Constructs a <code>ProfessionalTest</code> object.
     *
     * @param initial_code               String arguments. Means a test's code.
     * @param initial_title              String arguments. Means a test's title.
     * @param initial_difficultyDegree   int arguments. Means a test's difficultyDegree.
     * @param initial_scoreCriteria      String arguments. Means a test's scoreCriteria.
     * @param initial_programInstruction String arguments. Means a test's programInstruction.
     * @param initial_programming        String arguments. Means a test's programming.
     * @param initial_photoURL           String arguments. Means a test's photoURL.
     */
    public ProfessionalTest(String initial_code,
                            String initial_title,
                            int initial_difficultyDegree,
                            String initial_scoreCriteria,
                            String initial_programInstruction,
                            String initial_programming,
                            String initial_photoURL) {

        super(initial_code, initial_title, initial_difficultyDegree, initial_scoreCriteria);
        this.programInstruction = initial_programInstruction;
        this.programming = initial_programming;
        this.photoURL = initial_photoURL;
    }

    /**
     * Get the programInstruction of a ProfessionalTest object.
     *
     * @return the instruction of this test.
     */
    public String getProgramInstruction() {
        return this.programInstruction;
    }

    /**
     * Get the programming of a ProfessionalTest object.
     *
     * @return the programming of this test.
     */
    public String getProgramming() {
        return this.programming;
    }

    /**
     * Get the photoURL of a ProfessionalTest object.
     *
     * @return the photoURL of this test.
     */
    public String getPhotoURL() {
        return this.photoURL;
    }

    /**
     * Set a new value for programInstruction.
     *
     * @param new_programInstruction String arguments.a new value for programInstruction.
     */
    public void setProgramInstruction(String new_programInstruction) {
        this.programInstruction = new_programInstruction;
    }

    /**
     * Set a new value for programming.
     *
     * @param new_programming String arguments.a new value for programming.
     */
    public void setProgramming(String new_programming) {
        this.programming = new_programming;
    }

    /**
     * Set a new value for photoURL.
     *
     * @param new_photoURL String arguments.a new value for photoURL.
     */
    public void setPhotoURL(String new_photoURL) {
        this.photoURL = new_photoURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProfessionalTest that = (ProfessionalTest) o;
        return getProgramInstruction().equals(that.getProgramInstruction()) &&
                getProgramming().equals(that.getProgramming()) &&
                getPhotoURL().equals(that.getPhotoURL());
    }
}
