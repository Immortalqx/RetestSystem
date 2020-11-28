package RetestSystem.Strategy;

import RetestSystem.Base.*;

public class PlainTextStudentsFormatter implements StudentsFormatter {

    /*
      下面相当于"\n"
      Linux跟Windows是有差别的,"\n" 在Linux上不确定能不能运行；
      但Java是跨平台的，所以System.getProperty("line.separator") 在Linux跟Windows 都可以运行；
     */
    private final static String NEW_LINE = System.getProperty("line.separator");

    private static PlainTextStudentsFormatter singletonInstance;

    private PlainTextStudentsFormatter() {

    }

    /**
     * 实现单例模式
     *
     * @return the object of this class
     */
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
