package RetestSystem.Strategy;

import RetestSystem.Base.*;

public class XMLStudentsFormatter implements StudentsFormatter {

    /* Line separator */
    private final static String NEW_LINE = System.getProperty("line.separator");

    private static XMLStudentsFormatter singletonInstance;

    private XMLStudentsFormatter() {

    }

    public static XMLStudentsFormatter getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new XMLStudentsFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatStudents(StudentCatalog studentCatalog) {

        StringBuilder out = new StringBuilder("<StudentCatalog>" + NEW_LINE);

        for (Student student : studentCatalog) {
            out.append("  <Student id=\"<").append(student.getId()).append(">\" name=\"<").append(student.getName()).append(">\">").append(NEW_LINE);

            out.append("    <ExamPaper>").append(NEW_LINE);
            ExamPaper examPaper = student.getExamPaper();
            for (int i = 0; i < examPaper.getNumberOfItems(); i++) {
                out.append("      <Test code=\"<").append(examPaper.getTestItem(i).getTest().getCode()).append(">\"><").append(examPaper.getTestItem(i).getTest().getTitle()).append("></Test>").append(NEW_LINE);
            }
            out.append("    </ExamPaper>").append(NEW_LINE);
            out.append("  </Student>").append(NEW_LINE);
        }

        out.append("</StudentCatalog>").append(NEW_LINE);

        return out.toString();
    }
}