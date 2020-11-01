package RetestSystem;

import java.util.ArrayList;

public class TestDatabase {

    private ArrayList<Test> tests;

    /**
     * Add a test in this testDatabase.
     *
     * @param test Test arguments. The test you want to add in this testDatabase.
     */
    public void addTest(Test test) {
        tests.add(test);
    }

    /**
     * Remove a test in this testDatabase.
     *
     * @param test Test arguments. The test you want to Remove in this testDatabase.
     */
    public void removeTest(Test test) {
        tests.remove(test);
    }

    /**
     * get the test you want in this testDatabase.
     *
     * @param code int arguments. The test you want to get in this testDatabase.
     */
    public Test getTest(int code) {
        return tests.get(code);
    }

    /**
     * get the test you want in this testDatabase.
     *
     * @param code String arguments. The test you want to get in this testDatabase.
     */
    public Test getTest(String code) {
        for (Test test : tests) {
            if (test.getCode() == code)
                return test;
        }
        return null;
    }

    /**
     * get the number of tests in this testDatabase.
     */
    public int getNumberOfTests() {
        return tests.size();
    }

}
