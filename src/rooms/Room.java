
package rooms;

import group.Group;
import src.Teacher;

public class Room {
    public Room(int floor, int number){
        this.number = number + floor;
    }
    
    private int number;
    
    public int getNumber(){
        return number;
    }
    public void lesson(Teacher teacher, Group group){
        
    }
}
