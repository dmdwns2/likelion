package Study221006.Collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        ListPractice listPractice = new ListPractice();

        List<String> students = listPractice.getNames(); // List를 사용할 때는 뒤에 s를 붙여주는게 좋음 보통 여러개니까

        for (String student: students
        ) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
