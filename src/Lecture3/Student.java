package Lecture3;

import java.util.HashMap;
import java.util.Map;

public class Student extends Human{
    private final int course;
    public Map<String,Integer> grades = new HashMap<String,Integer>();
    public Student(String name, int age,int course,Map<String,Integer> grades) {
        super(name, age);
        this.course = course;
        this.grades = grades;
    }
    public int getCourse(){
        return course;
    }
    public void  getGrades() {
        for(Map.Entry<String,Integer> entry : grades.entrySet()){
            System.out.println("Subject: "+ entry.getKey() + " Mark: "+ entry.getValue());

        }

    }
    @Override
    public String toString() {
        getGrades();
        return "[course= " + course +", name="+name+", age="+age+"]" +"\n"+"----------------------------" ;
    }

}
