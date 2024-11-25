package Lecture3;

public class Professor {
    int timeofwork;
    String degree;
    private int wage ;

    public Professor(int timeofwork, String degree, int wage) {
        this.timeofwork = timeofwork;
        this.degree = degree;
        this.wage = wage;
    }
    public int getwage(){
        return wage;
    }


}
