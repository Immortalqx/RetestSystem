package RetestSystem.Base;

/**
 * This class implements a TestItem.
 */
public class TestItem {

    /**
     * the Test object in this testItem.
     */
    public Test test;
    private double score;

    /**
     * Constructs a <code>TestItem</code> object.
     *
     * @param initial_test  Test arguments. Means a testItem's initial_test.
     * @param initial_score double arguments. Means a testItem's initial_score.
     */
    public TestItem(Test initial_test, double initial_score) {
        this.test = initial_test;
        this.score = initial_score;
    }

    /**
     * Get the score of a TestItem object.
     *
     * @return the score of this testItem.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set a new value for score.
     *
     * @param new_score double arguments. Means a testItem's new_score you want to set.
     */
    public void setScore(double new_score) {
        this.score = new_score;
    }

    /**
     * Get the Test of a TestItem object.
     *
     * @return the Test of this testItem.
     */
    public Test getTest() {
        return test;
    }
}
