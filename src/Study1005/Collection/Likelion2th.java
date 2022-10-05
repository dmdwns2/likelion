package Study1005.Collection;

import java.util.ArrayList;
import java.util.List;

public class Likelion2th {
    Names names = new Names();
    List<String> students = new ArrayList<>();

    public List<String> getStudentList() {
        names.getNames(students);
        return this.students;
    }

    public Likelion2th() {
        getStudentList();
    }
}
