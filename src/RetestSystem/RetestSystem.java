package RetestSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class implements a retest system.
 *
 * @author 刘权祥
 * @version 1.5.0
 * @see EnglishTest
 * @see ExamPaper
 * @see MathTest
 * @see ProfessionalTest
 * @see Student
 * @see StudentCatalog
 * @see Test
 * @see TestDatabase
 * @see TestItem
 */

public class RetestSystem {

    private static final BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter stdOut = new PrintWriter(System.out, true);
    private static final PrintWriter stdErr = new PrintWriter(System.err, true);

    private final StudentCatalog studentCatalog;
    private final TestDatabase testDatabase;

    /**
     * Loads the information of the student catalog and the test database and starts
     * the application.
     *
     * @param args String arguments. Not used.
     * @throws IOException if there are errors in the input.
     */
    public static void main(String[] args) throws IOException {

        StudentCatalog studentCatalog = loadStudent();

        TestDatabase testDatabase = loadTestDatabase();

        RetestSystem app = new RetestSystem(studentCatalog, testDatabase);

        app.run();
    }

    /**
     * Constructs a <code>RetestSystem</code> object. Initialize the student catalog
     * and the test database with the values specified in the parameters.
     *
     * @param initialStudentCatalog StudentCatalog arguments.
     * @param initialTestDatabase   TestDatabase arguments.
     */
    public RetestSystem(StudentCatalog initialStudentCatalog, TestDatabase initialTestDatabase) {

        this.studentCatalog = initialStudentCatalog;
        this.testDatabase = initialTestDatabase;
    }

    /**
     * Loads the information of a test database.
     *
     * @return the initialed estDatabase.
     */
    private static TestDatabase loadTestDatabase() {

        TestDatabase testDatabase = new TestDatabase();

        testDatabase.addTest(new EnglishTest("E001", "Translate the following text into English.", 2,
                "Smooth, fluent and without language problems or wrong words", "C-E"));
        testDatabase.addTest(new EnglishTest("E002", "Translate the following article content.", 3,
                "Clear logic and no language problems", "E-C"));
        testDatabase.addTest(new EnglishTest("E003", "Choose the correct answer based on the content being played.", 3,
                "Correct answer", "Hearing"));
        testDatabase.addTest(new EnglishTest("E004", "Translate the following Chinese in English.", 2,
                "No grammatical errors", "C-E"));
        testDatabase.addTest(
                new EnglishTest("E005", "Translate the following English in Chinese.", 2, "Sentence fluent", "E-C"));
        testDatabase.addTest(new EnglishTest("E006", "Choose the correct answer based on contextual dialogue", 2,
                "Right", "Hearing"));
        testDatabase.addTest(
                new EnglishTest("E007", "Translate the following article content.", 3, "Smooth and fluent", "C-E"));
        testDatabase.addTest(new EnglishTest("E008", "Translate to Chinese", 3, "Complete translation", "E-C"));
        testDatabase.addTest(new EnglishTest("E009", "Listen to the dialogue and choose Xiao Ming’s weekend schedule.",
                3, "Correct answer", "Hearing"));
        testDatabase.addTest(new EnglishTest("E010", "Translate the following text into English.", 2,
                "Use the correct words and smooth", "C-E"));

        testDatabase.addTest(new MathTest("M001", "Find the inflection points of the following functions.", 2, "Right",
                "no image", "no"));
        testDatabase
                .addTest(new MathTest("M002", "Which of the following series converge?", 3, "Right", "no image", "no"));
        testDatabase.addTest(new MathTest("M003", "Find the differential equation of the following function.", 3,
                "Necessary problem-solving process", "no image",
                "The first step is to find the integral. The second step is to find the value of the constant c."));
        testDatabase.addTest(new MathTest("M004", "Find the angle between the two planes A and B.", 2, "Correct answer",
                "http://image.com/m004", "no"));
        testDatabase.addTest(new MathTest("M005", "Several extreme points in the figure below.", 3, "Right",
                "http://image.com/m005", "no"));
        testDatabase.addTest(new MathTest("M006", "Find the inflection points of the following functions.", 2, "Right",
                "no image", "no"));
        testDatabase.addTest(new MathTest("M007", "Find the differential equation of the following function.", 3,
                "Clear problem solving process and correct value", "no image",
                "Find the value of the constant b and the differential equation"));
        testDatabase
                .addTest(new MathTest("M008", "The area enclosed by the following curve and the coordinate axis is?", 1,
                        "Correct answer", "http://image.com/m008", "no"));
        testDatabase.addTest(new MathTest("M009", "Find general solutions of differential equations.", 2,
                "The parameters are correct", "no image", "Find the value of the parameter"));
        testDatabase
                .addTest(new MathTest("M010", "Find the function f(x).", 2, "Right", "http://image.com/m009", "no"));

        testDatabase.addTest(new ProfessionalTest("P001", "What are the characteristics of JAVA language?", 1, "Right",
                "Name at least three of the characteristics", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P002",
                "Fill in the following blanks to realize the calculation of the sum of the numbers between 1-200 that are not divisible by 5.",
                2, "Correct result at run", "Fill in the code in the blank.", "no", "http://image.com/p002"));
        testDatabase.addTest(new ProfessionalTest("P003", "The time complexity of the algorithm refers to?", 1,
                "Correct answer", "no", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P004", "The number sequence bai is: 1,1,1,2,3,4,6,...", 3,
                "Correct result at run", "Calculation formula when filling in n.",
                "int main()\n" + "{int a[21]={0,1,1},i;\n" + " for(i=1;i<21;i++)\n"
                        + "   if(i<3) printf(\"%d \",a[i]);\n" + "     else printf(\"%d \",______);\n"
                        + " printf(\"\\n when n is 20：%d\\n\",a[20]);\n" + " return 0;\n" + "}",
                "no image"));
        testDatabase.addTest(new ProfessionalTest("P005",
                "The design of the database includes two aspects of design content, they are?", 2, "Similar in meaning",
                "no", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P006", "The difference between java and c.", 2,
                "At least three points", "At least three points", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P007", "The difference between process and thread.", 3,
                "At least three points", "At least three points", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P008", "The time complexity of the following code is?", 1, "Right",
                "no", "no", "http://image.com/p008"));
        testDatabase.addTest(new ProfessionalTest("P009", "Benefits of thread pool.", 3, "Can name the key benefits",
                "no", "no", "no image"));
        testDatabase.addTest(new ProfessionalTest("P010", "Enter 5 numbers to find their maximum and average.", 3,
                "Correct result at run", "Time complexity cannot exceed n.)", "no", "no image"));

        return testDatabase;
    }

    /**
     * Loads the information of a student catalog.
     *
     * @return the initialed studentCatalog.
     */
    private static StudentCatalog loadStudent() {
        StudentCatalog studentCatalog = new StudentCatalog();
        studentCatalog.addStudent(new Student("2019213001", "吴广胜"));
        studentCatalog.addStudent(new Student("2019213002", "陈盛典"));
        studentCatalog.addStudent(new Student("2019213003", "刘子豪"));
        studentCatalog.addStudent(new Student("2019213004", "仇历"));
        studentCatalog.addStudent(new Student("2019213005", "郑西泽"));
        studentCatalog.addStudent(new Student("2019213006", "李梦琪"));
        studentCatalog.addStudent(new Student("2019213007", "王志"));
        studentCatalog.addStudent(new Student("2019213008", "张天一"));
        studentCatalog.addStudent(new Student("2019213009", "周琳琳"));
        studentCatalog.addStudent(new Student("2019213010", "周爽"));
        studentCatalog.addStudent(new Student("2019213011", "张涵"));
        studentCatalog.addStudent(new Student("2019213012", "李依然"));
        studentCatalog.addStudent(new Student("2019213013", "孟子涛"));
        studentCatalog.addStudent(new Student("2019213014", "腊志翱"));
        studentCatalog.addStudent(new Student("2019213015", "张一鸣"));
        studentCatalog.addStudent(new Student("2019213016", "李华"));
        studentCatalog.addStudent(new Student("2019213017", "冷子晴"));
        studentCatalog.addStudent(new Student("2019213018", "金灿"));
        studentCatalog.addStudent(new Student("2019213019", "朱文杰"));
        studentCatalog.addStudent(new Student("2019213020", "刘美含"));

        return studentCatalog;
    }

    /**
     * Presents the user with a menu of options and processes the selection.
     */
    private void run() throws IOException {

        int choice = getChoice();

        while (choice != 0) {

            if (choice == 1) {
                addStudentToCatalog();
            } else if (choice == 2) {
                displayStudentCatalog();
            } else if (choice == 3) {
                displayExamPaper();
            } else if (choice == 4) {
                generateExamPaper();
            } else if (choice == 5) {
                entryScore();
            } else if (choice == 6) {
                lookupTotalScore();
            } else if (choice == 7) {
                lookupTestScore();
            }

            choice = getChoice();
        }
    }

    /**
     * Validates the user's choice.
     *
     * @return the choice input.
     * @throws IOException if can't get the choice rightly.
     */
    private int getChoice() throws IOException {

        int input;

        do {
            try {
                stdErr.println();
                stdErr.print("[0]  Quit\n" + "[1]  Add students to the system.\n" + "[2]  Display all students.\n"
                        + "[3]  Display exam paper through student identification code (including test question number, question stem and difficulty coefficient).\n"
                        + "[4]  Generate random retest papers for designated students.\n" + "[5]  Enter the retest score of the designated student.\n"
                        + "[6]  Display the total score of the specified student's retest exam.\n"
                        + "[7]  Display the score of each question of the designated student's re-examination exam.\n" + "choice> ");
                stdErr.flush();

                input = Integer.parseInt(stdIn.readLine());

//                stdErr.println();
//                stdOut.flush();

                if (0 <= input && 7 >= input) {
                    break;
                } else {
                    stdErr.println("Invalid choice:  " + input);
                }
            } catch (NumberFormatException nfe) {
                stdErr.println(nfe);
            }
        } while (true);

        return input;
    }

    /**
     * Look up the student's score for each test.
     *
     * @throws IOException if read student failed.
     */
    private void lookupTestScore() throws IOException {

        Student student = readStudent();
        if (student == null) {
            stdErr.println("Can't find the student id! Please input again!");
            lookupTestScore();
        }
        assert student != null;
        ExamPaper examPaper = student.getExamPaper();
        if (examPaper == null || examPaper.getNumberOfItems() < 10) {
            stdErr.println("The Student hasn't got a test paper yet. Please complete it.");
            return;
        }
        for (int i = 0; i < 10; i++) {
            stdOut.println("The Score of item " + (i + 1) + " is : " + examPaper.getTestItem(i).getScore());
        }

    }

    /**
     * Look up the total score of the student.
     *
     * @throws IOException if read student failed.
     */
    private void lookupTotalScore() throws IOException {
        Student student = readStudent();
        if (student == null) {
            stdErr.println("Can't find the student id! Please input again!");
            lookupTotalScore();
        }
        assert student != null;
        stdErr.println("The total score of the student is: " + student.getExamPaper().getTotalScore());
    }

    /**
     * Input the score of each test in the retest of the designated student.
     *
     * @throws IOException if entry score failed.
     */
    private void entryScore() throws IOException {

        int flag = 0;
        stdErr.print("Student id> ");
        stdErr.flush();
        String id = stdIn.readLine();

        for (Student student : this.studentCatalog) {
            if (student.getId().equals(id)) {

                flag++;
                if (student.getExamPaper() == null) {
                    stdErr.print("The student hasn't got a test paper yet. Please complete it");
                } else {

                    ExamPaper examPaper = student.getExamPaper();

                    for (int i = 0; i < examPaper.getNumberOfItems(); i++) {

                        stdErr.print("The score of item" + " " + (i + 1) + " " + "is:");
                        stdErr.flush();
                        String readScore = stdIn.readLine();
                        if (isNumber(readScore)) {
                            double score = Double.parseDouble(readScore);
                            if (score > 10 || score < 0) {
                                stdErr.println("The score of each test is no more than 10 or less than 0. Please re-enter!");
                                i--;
                            } else {
                                examPaper.getTestItem(i).setScore(score);
                            }
                        } else {
                            stdErr.println("Please enter a number!");
                            i--;
                        }
                    }

                    stdOut.println("Record the score successfully!");
                }
            }
        }

        if (flag == 0) {

            stdErr.println("The student is not in the student catalog");
        }
    }

    /**
     * Generate a random retest paper for the designated student.
     *
     * @throws IOException if read student failed.
     */
    private void generateExamPaper() throws IOException {

        Student student = readStudent();

        if (student == null) {
            stdErr.println("There is no student with that id.");
        } else {

            if (testDatabase.getNumberOfTests() < 10) {
                stdErr.println("There are less than ten test questions in the test question bank, "
                        + "and the test paper cannot be generated.");
            } else {

                int[] testTypeNums = new int[3];

                for (Test test : this.testDatabase) {
                    if (test instanceof EnglishTest) {
                        testTypeNums[0]++;
                    } else if (test instanceof MathTest) {
                        testTypeNums[1]++;
                    } else if (test instanceof ProfessionalTest) {
                        testTypeNums[2]++;
                    }
                }

                if (testTypeNums[0] < 3 || testTypeNums[1] < 3 || testTypeNums[2] < 4) {
                    stdErr.println("There are not enough English questions or math questions or professional "
                            + "questions in the test database.");
                    return;
                }
                //采用随机生成试卷
                Random random = new Random();
                ExamPaper examPaper = new ExamPaper();

                Arrays.fill(testTypeNums, 0);

                int allTestCount = testDatabase.getNumberOfTests();

                boolean[] testIsChoose = new boolean[allTestCount];

                while (examPaper.getNumberOfItems() < 10) {

                    int target = random.nextInt(allTestCount);
                    Test test = testDatabase.getTest(target);

                    if (test instanceof EnglishTest) {
                        if (testTypeNums[0] < 3 && (!testIsChoose[target])) {
                            testTypeNums[0]++;
                            examPaper.addTestItem(new TestItem(test, 0));
                            testIsChoose[target] = true;
                        }
                    } else if (test instanceof MathTest) {
                        if (testTypeNums[1] < 3 && (!testIsChoose[target])) {
                            testTypeNums[1]++;
                            examPaper.addTestItem(new TestItem(test, 0));
                            testIsChoose[target] = true;
                        }
                    } else if (test instanceof ProfessionalTest) {
                        if (testTypeNums[2] < 4 && (!testIsChoose[target])) {
                            testTypeNums[2]++;
                            examPaper.addTestItem(new TestItem(test, 0));
                            testIsChoose[target] = true;
                        }
                    }

                }
                student.setExamPaper(examPaper);
                stdOut.println("Test papers have been generated for this student!");
            }
        }
    }

    /**
     * Display the retest paper for the designated student.
     *
     * @throws IOException if read student failed.
     */
    private void displayExamPaper() throws IOException {
        Student student = readStudent();

        if (student == null) {
            stdErr.println("Can't find this student! Please input again!");
            displayExamPaper();
        }

        assert student != null;
        ExamPaper examPaper = student.getExamPaper();

        if (examPaper == null)
            stdErr.println("No test Papers have been generated for this student!");
        else {
            for (TestItem testItem : examPaper) {
                stdOut.println(testItem.test.getCode() + " | " + testItem.test.getTitle() + " | " + testItem.getScore());
            }
        }

    }

    /**
     * Obtains a Student object.
     *
     * @return the Student find by student id.
     * @throws IOException if read student failed.
     */
    private Student readStudent() throws IOException {

        stdErr.print("Student id> ");
        stdErr.flush();

        return this.studentCatalog.getStudent(stdIn.readLine());
    }

    /**
     * Displays the catalog of students.
     */
    private void displayStudentCatalog() {
        for (Student student : studentCatalog)
            stdOut.println(student.getId() + "_" + student.getName());

        stdOut.flush();
    }

    /**
     * Add a student into the system.
     *
     * @throws IOException if read student failed.
     */
    private void addStudentToCatalog() throws IOException {

        Student student = addStudent();

        this.studentCatalog.addStudent(student);
        stdOut.println("Successfully added a student into the system!");

    }

    /**
     * Obtains a Student object.
     *
     * @throws IOException if add student failed.
     */
    private Student addStudent() throws IOException {

        stdErr.print("Student id> ");
        stdErr.flush();
        String id = stdIn.readLine();
        id = id.trim();

        while (id.length() <= 0) {
            stdErr.println("WRONG INPUT!");

            stdErr.print("Student id> ");
            stdErr.flush();
            id = stdIn.readLine();
            id = id.trim();
        }

        stdErr.print("Student name> ");
        stdErr.flush();
        String name = stdIn.readLine();
        name = name.trim();

        while (name.length() <= 0) {
            stdErr.println("WRONG INPUT!");

            stdErr.print("Student id> ");
            stdErr.flush();
            name = stdIn.readLine();
            name = name.trim();
        }

        return new Student(id, name);
    }

    /**
     * Determine whether the input information is a number.
     *
     * @param str String arguments. the String object need to judge.
     * @return true if str is number; false if str is not number.
     */
    public boolean isNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher match = pattern.matcher(str);
        return match.matches();
    }

}
