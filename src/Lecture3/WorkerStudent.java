package Lecture3;

import java.util.ArrayList;
import java.util.List;

public class WorkerStudent<T extends Student>  {
    private  T student;
    List<T> list = new ArrayList<T>();
    WorkerStudent(List<T> list) {
        this.list = list;
    }
    public void getInfoaboutStudentwhohave(MyPredicate m) {
        for (T student : list) {
            if (m.test(student.age)) {
                System.out.println(student.toString());
            }
        }
    }
}
