package RetestSystem;

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
     */
    public String getProgramInstruction() {
        return this.programInstruction;
    }

    /**
     * Get the programming of a ProfessionalTest object.
     */
    public String getProgramming() {
        return this.programming;
    }

    /**
     * Get the photoURL of a ProfessionalTest object.
     */
    public String getPhotoURL() {
        return this.photoURL;
    }

    /**
     * Set a new value for programInstruction.
     */
    public void setProgramInstruction(String new_programInstruction) {
        this.programInstruction = new_programInstruction;
    }

    /**
     * Set a new value for programming.
     */
    public void setProgramming(String new_programming) {
        this.programming = new_programming;
    }

    /**
     * Set a new value for photoURL.
     */
    public void setPhotoURL(String new_photoURL) {
        this.photoURL = new_photoURL;
    }

}
