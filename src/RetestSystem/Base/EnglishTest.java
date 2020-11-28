package RetestSystem.Base;


/**
 * This class implements a EnglishTest.
 */
public class EnglishTest extends Test {

    private String type;

    /**
     * Constructs a <code>EnglishTest</code> object.
     *
     * @param initial_code             String arguments. Means a test's code.
     * @param initial_title            String arguments. Means a test's title.
     * @param initial_difficultyDegree int arguments. Means a test's difficultyDegree.
     * @param initial_scoreCriteria    String arguments. Means a test's scoreCriteria.
     * @param initial_type             String arguments. Means a test's type.
     */
    public EnglishTest(String initial_code,
                       String initial_title,
                       int initial_difficultyDegree,
                       String initial_scoreCriteria,
                       String initial_type) {

        super(initial_code, initial_title, initial_difficultyDegree, initial_scoreCriteria);
        this.type = initial_type;
    }

    /**
     * Get the type of an EnglishTest object.
     *
     * @return the type of an EnglishTest object.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set a new value for type.
     *
     * @param new_type String arguments. Means a test's type.
     */
    public void setType(String new_type) {
        this.type = new_type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EnglishTest that = (EnglishTest) o;
        return getType().equals(that.getType());
    }

}
