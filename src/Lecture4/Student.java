package Lecture4;

import java.util.Map;

public class Student {
    private String name;
    private int course;
    private int group;
    private Map<String,Integer> marks;

    public Student(Map<String, Integer> marks, int group, int course, String name) {
        this.marks = marks;
        this.group = group;
        this.course = course;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
    public double getAvgMarks() {
        double sum = 0;
        for(Map.Entry<String, Integer> entry : marks.entrySet()  ) {
            sum+=entry.getValue();
        }
        return sum/marks.size();
    }
    public void pluscourse(){
        course++;
    }
    public boolean equals(Object s) {
        if (s==this)return true;
        if(s == null || getClass() != s.getClass()) return false;
        Student student = (Student) s;
        return this.name == student.getName()
                && this.course==student.getCourse()
                && this.group==student.getGroup();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", marks=" + marks +
                '}';
    }
}
