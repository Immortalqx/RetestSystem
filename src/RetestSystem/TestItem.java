package RetestSystem;

public class TestItem {

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
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set a new value for score.
     */
    public void setScore(double new_score) {
        this.score = new_score;
    }

}
