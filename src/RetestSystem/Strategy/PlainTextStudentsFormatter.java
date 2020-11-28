package RetestSystem.Strategy;

import RetestSystem.Base.*;

public class PlainTextStudentsFormatter implements StudentsFormatter {

    /* Line separator */
    private final static String NEW_LINE = System.getProperty("line.separator");

    private static PlainTextStudentsFormatter singletonInstance;

    private PlainTextStudentsFormatter() {

    }

    public static PlainTextStudentsFormatter getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new PlainTextStudentsFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatStudents(StudentCatalog studentCatalog) {

        StringBuilder out = new StringBuilder();
        for (Student student : studentCatalog) {
            out.append(student.getId());
            out.append("_").append(student.getName());

            ExamPaper examPaper = student.getExamPaper();
            for (int i = 0; i < examPaper.getNumberOfItems(); i++) {
                out.append("_").append(examPaper.getTestItem(i).getTest().getCode());
            }

            out.append(NEW_LINE);
        }

        return out.toString();
    }
}
