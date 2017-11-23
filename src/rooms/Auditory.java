package rooms;
 
import group.Group;
import src.Teacher;

public class Auditory extends Room{
    public Auditory(int floor, int number) {
        super(floor, number);
    }

    public int chooseAuditory() {
        return this.getNumber();
    }
    
    @Override
    public void lesson(Teacher teacher, Group group){
        group.listenLecture(teacher.giveLecture());
    }
}
