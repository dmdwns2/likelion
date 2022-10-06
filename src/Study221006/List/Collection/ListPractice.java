package Study221006.List.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    private List<String> students;


    public ListPractice(){
        students = new ArrayList<>();
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");
        this.students.add("안준휘");
    }
    public List<String> getNames() {
        return this.students;
    }
}

