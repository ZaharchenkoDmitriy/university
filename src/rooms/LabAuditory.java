package rooms;

import src.Teacher;
import group.Group;

public class LabAuditory extends Room{
    public LabAuditory(int floor, int number) {
        super(floor, number);
    }
   
    @Override
    public void lesson(Teacher teacher, Group group){
        group.practice();
    }
   
    public void testStudents(Teacher teacher,Group group){
        teacher.testStudents(group);
    }
    
}
