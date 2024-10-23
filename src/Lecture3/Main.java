package Lecture3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.lang.Math.pow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Student> students_1 = new ArrayList<>();
    public static void main(String[] args) {


        Map<String,Integer> bobmarks= new HashMap<>();
        bobmarks.put("Math",5);
        bobmarks.put("English",5);
        bobmarks.put("IT",5);

        Map<String,Integer> squidwardmarks= new HashMap<>();
        squidwardmarks.put("Math",4);
        squidwardmarks.put("English",3);
        squidwardmarks.put("IT",5);

        Map<String,Integer> crabsmarks= new HashMap<>();
        crabsmarks.put("Math",3);
        crabsmarks.put("English",3);
        crabsmarks.put("IT",3);

        WorkerStudent<Student> worker = new WorkerStudent<>(students_1);
        addstudents(()->new Student("Crabs",18,1,crabsmarks));
        addstudents(()->new Student("Squidward",20,3,squidwardmarks));
        addstudents(()->new Student("Bob",26,4,bobmarks));
        System.out.println("Средний возраст   ");
        System.out.println(avggrade(students_1, p->p.age));
        System.out.println("----------------------------");

        worker.getInfoaboutStudentwhohave(p -> p%13==0);
        discriminant(2,5,1,(q,w,e)->pow(w,2)-4*q*e);

    }
    public static void discriminant(double a,double b , double c,Discriminant d){
        System.out.println("Результат дискриминанта : "+d.disc(a,b,c));
    }
    public static void addstudents(Supplier<Student> su){
        students_1.add(su.get());
    }
    public static double avggrade(List<Student> st, Function<Student,Integer> f){
        double res=0;
        for (Student s : st) {
            res+=f.apply(s);
        }

        res = res / st.size();
        return res;
    }

}
interface Discriminant{
    double disc(double a, double b, double c);

}