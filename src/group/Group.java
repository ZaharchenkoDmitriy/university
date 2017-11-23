package group;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Group {
    public Group (String name){
        course = 1;
        this.name = name;
    }
    
    ArrayList<Student> students = new ArrayList();
    public void addNewStudent(Student student) {
        if (student.getSATPoint() > 150){
            students.add(student);
        }
    }
    private String name="";
    private int course;
    
    public ArrayList<Student> getGroup(){
        return students;
    }
    public void listenLecture(String knowledge){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            s.listenLecture(knowledge);
        }

    }
    public void testGroup(String knowledge){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();

            if(!s.testStudent((knowledge)))
                iterator.remove();
        }
    }
    public void practice() {
        //Практика у группы, к сожалению в нашем универеситете о таком не знают, по этому пусто
    }
    public boolean tryToRotateToNextCourse(){
        if(course+1 < 5){
            course++;
            return true;
        }
        else
            return false;
    }
    @Override
    public String toString(){
        String result = '\n' + this.name +':';
        result+=students.toString();
        return result;
    }
}
