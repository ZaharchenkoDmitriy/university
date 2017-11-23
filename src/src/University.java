package src;

import group.Group;
import java.time.Year;
import rooms.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import rooms.Auditory;



public class University {
    public University(ArrayList<Group> groups, ArrayList<Teacher> teachers){
        rooms = new ArrayList();
        for(int i = 0 ; i < 10; i++) {
            for(int j = 0; j<10; j++)
                rooms.add(new Auditory(i,j));
        } 
        
        this.groups = groups;
        this.teachers = teachers;
        this.year = Year.now().getValue();
        startYear();
    }
    
    private ArrayList<Group> groups;
    private ArrayList<Room> rooms;
    private ArrayList<Teacher> teachers;
    
    private int year;
    
    public void startYear() {
        for(int i = 0 ; i<2;i++) {
            startSimestr();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {}
        }
        System.out.println(year + groups.toString());
        Iterator<Group> iterator = groups.iterator();
        
        while(iterator.hasNext()){        
            Group g = iterator.next();
            if(!g.tryToRotateToNextCourse())
                iterator.remove();
        }
    
        year++;
    }
    private void startSimestr(){
        for(int i = 0 ; i<14;i++) {
            startWeek();
        }
        
        session();
    }
    private void startWeek(){
        for(int i = 0; i < 5; i++){
            startDay();
        }
    }
    private void startDay(){
        //Тут еще должны быть проверки с рассписанием, свободгыми аудиториями и тд 
        for(int i = 0 ; i < 5; i++) {
            for(int j = 0 ; j < teachers.size(); j++) {
                rooms.get(j).lesson(teachers.get(j), groups.get(j));
            }
        }
    }
    private void session(){
        Iterator<Group> g = groups.iterator();
        Iterator<Teacher> t = teachers.iterator();
        while (g.hasNext()) {
            Group group = g.next();
            while (t.hasNext()){
                Teacher teacher = t.next();
                teacher.testStudents(group);
            }
        }
    }
    public void addNewCourse(ArrayList<Group> groups) {
        for(int i = 0 ; i <groups.size();i++){
            this.groups.add(groups.get(i));
        }
    } 
}
