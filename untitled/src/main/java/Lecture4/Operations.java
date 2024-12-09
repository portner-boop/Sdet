package Lecture4;

import java.util.List;

public class Operations {
    List<Student> students;

    public Operations(List<Student> students) {
        this.students = students;
    }

    public List<Student> delete(){

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getAvgMarks() >= 3)
                .toList();
        filteredStudents.forEach(Student::pluscourse);
        return filteredStudents;
    }
    public void printStudents( int course){
         students.stream().filter(s->s.getCourse()==course).forEach(System.out::println);

    }
}
