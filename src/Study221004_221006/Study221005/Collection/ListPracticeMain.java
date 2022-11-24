package Study221004_221006.Study221005.Collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        Likelion2th likelion2th = new Likelion2th();
        List<String> students = likelion2th.getStudentList();

        for (String student: students
             ) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
