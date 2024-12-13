package Lecture4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void deleteStudentsUnderThree(List<Student> students){

    }
    public static void main(String[] args) {
        Map<String,Integer> student0m= new HashMap<>();
        student0m.put("Math",4);
        student0m.put("English",3);
        student0m.put("IT",5);

        Map<String,Integer> student1m= new HashMap<>();
        student1m.put("Math",4);
        student1m.put("English",3);
        student1m.put("IT",5);

        Map<String,Integer> student2m= new HashMap<>();
        student2m.put("Math",3);
        student2m.put("English",3);
        student2m.put("IT",3);

        List<Student> students= new ArrayList<>();

        Student student0 = new Student(student0m,1,1,"Damir");
        Student student1 = new Student(student0m,2,3,"Egor");
        Student student2= new Student(student0m,3,1,"Dima");

        students.add(student0);
        students.add(student1);
        students.add(student2);
        Operations operations = new Operations(students);
        operations.printStudents(1);
        operations.delete();
        operations.printStudents(4);



    }
}
