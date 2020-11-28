package RetestSystem.Strategy;

import RetestSystem.Base.*;

public class HTMLStudentsFormatter implements StudentsFormatter {

    /* Line separator */
    private final static String NEW_LINE = System.getProperty("line.separator");

    private static HTMLStudentsFormatter singletonInstance;

    private HTMLStudentsFormatter() {

    }

    public static HTMLStudentsFormatter getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new HTMLStudentsFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatStudents(StudentCatalog studentCatalog) {
        StringBuilder out = new StringBuilder(
                "<html>" + NEW_LINE +
                        "  <body>" + NEW_LINE +
                        "    <center><h2>学生目录</h2></center>" + NEW_LINE);

        for (Student student : studentCatalog) {
            out.append("    <hr>").append(NEW_LINE);
            out.append("    <h4>").append(student.getId()).append(" ").append(student.getName()).append("</h4>").append(NEW_LINE);
            out.append("      <blockquote>").append(NEW_LINE);

            ExamPaper examPaper = student.getExamPaper();
            for (int i = 0; i < examPaper.getNumberOfItems(); i++) {
                out.append("        <").append(examPaper.getTestItem(i).getTest().getCode()).append("> <");
                out.append(examPaper.getTestItem(i).getTest().getTitle()).append("<br>");
                out.append(NEW_LINE);
            }

            out.append("      </blockquote>");
            out.append(NEW_LINE);
        }

        out.append("  </body>").append(NEW_LINE).append("</html>").append(NEW_LINE);

        return out.toString();
    }
}
