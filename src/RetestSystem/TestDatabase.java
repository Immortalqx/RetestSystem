package RetestSystem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements a TestDatabase.
 */
public class TestDatabase implements Iterable<Test> {

    private final ArrayList<Test> tests = new ArrayList<Test>();

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
     *
     * @return the test get by the code
     */
    public Test getTest(int code) {
        return tests.get(code);
    }

    /**
     * get the test you want in this testDatabase.
     *
     * @param code String arguments. The test you want to get in this testDatabase.
     *
     * @return null when can't find the test, or test when find test by code
     */
    public Test getTest(String code) {
        for (Test test : tests) {
            if (test.getCode().equals(code))
                return test;
        }
        return null;
    }

    /**
     * get the number of tests in this testDatabase.
     * @return the number of tests.
     */
    public int getNumberOfTests() {
        return tests.size();
    }

    @Override
    public Iterator<Test> iterator() {
        return tests.iterator();
    }
}
