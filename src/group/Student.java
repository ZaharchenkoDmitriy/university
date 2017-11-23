
package group;

import java.util.ArrayList;
import java.util.Random;

public class Student {
    public Student(String name, double SATPoint){
        this.name = name;
        this.SATPoint = SATPoint;
    }
    
    private String name;
    private double SATPoint;
    private ArrayList<String> knowladges = new ArrayList();
    
    public String getStudentName(){
        return name;
    }
    public double getSATPoint(){
        return SATPoint;
    }
    public void listenLecture(String knowladge){
        Random random = new Random();
        if(random.nextInt(20) > 15)
            knowladges.add(knowladge);
    }
    public boolean testStudent(String knowladge){
        return knowladges.indexOf(knowladge) != -1;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
