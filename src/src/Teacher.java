package src;

import group.Group;
import java.util.ArrayList;


public class Teacher {
    public Teacher(ArrayList<String> knowledges) {
        this.knowledges = knowledges;
        lectureNumber = 0;
    }
    
    ArrayList<String> knowledges = new ArrayList();
    int lectureNumber;
    
    public String giveLecture() {
        //lectureNumber++;
        return knowledges.get(lectureNumber);
    }
    public void testStudents(Group group){
        group.testGroup(knowledges.get(lectureNumber));
    }
}
