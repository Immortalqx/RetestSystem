package RetestSystem;

public class MathTest extends Test {

    private String photoURL;
    private String calculationProcess;

    /**
     * Constructs a <code>MathTest</code> object.
     *
     * @param initial_code               String arguments. Means a test's code.
     * @param initial_title              String arguments. Means a test's title.
     * @param initial_difficultyDegree   int arguments. Means a test's difficultyDegree.
     * @param initial_scoreCriteria      String arguments. Means a test's scoreCriteria.
     * @param initial_photoURL           String arguments. Means a test's initial_photoURL.
     * @param initial_calculationProcess String arguments. Means a test's initial_calculationProcess.
     */
    public MathTest(String initial_code,
                    String initial_title,
                    int initial_difficultyDegree,
                    String initial_scoreCriteria,
                    String initial_photoURL,
                    String initial_calculationProcess) {

        super(initial_code, initial_title, initial_difficultyDegree, initial_scoreCriteria);
        this.photoURL = initial_photoURL;
        this.calculationProcess = initial_calculationProcess;
    }

    /**
     * Get the photoURL of a MathTest object.
     */
    public String getPhotoURL() {
        return this.photoURL;
    }

    /**
     * Get the getCalculationProcess of a MathTest object.
     */
    public String getCalculationProcess() {
        return this.calculationProcess;
    }

    /**
     * Set a new value for photoURL.
     */
    public void setPhotoURL(String new_photoURL) {
        this.photoURL = new_photoURL;
    }

    /**
     * Set a new value for calculationProcess.
     */
    public void setCalculationProcess(String new_calculationProcess) {
        this.calculationProcess = new_calculationProcess;
    }

}
