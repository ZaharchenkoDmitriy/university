// Успел сделать только структуру, в дальнейшем можно разширить механизмы сдачи экзаменнов, усвоения материала, проведения лекций и практик
// и запустить сиумляцию с заданными вероятностями всех событий

package main;
 
import group.*;
import src.*;
import java.util.ArrayList;
import java.util.Random;

import rooms.*;


public class simulation {
    public static void main(String[] args) {
        Group ki16 = new Group("ki-16");
        Student Dima = new Student("Dima",170);
        ki16.addNewStudent(Dima);
        ArrayList<Group> groups = new ArrayList();
        groups.add(ki16);
        
        ArrayList<String> knowladges = new ArrayList();
        knowladges.add("asdas");
        Teacher teacher = new Teacher(knowladges);
        ArrayList<Teacher> teachers = new ArrayList();
        teachers.add(teacher);

        University Chnu = new University(groups, teachers);
        
        while(true){
            Random random = new Random();
            String groupName = "";
            groupName += (char)(60+random.nextInt()%25);
            groupName +=(char)(60+random.nextInt()%25);
            groupName += "-";
            Group tempGroup = new Group(groupName);

            for(int i = 1 ; i < 5; i++ ) {
                String studentName = "";
                for(int j = 0 ; j < 5;j++) {
                    studentName += (char)(random.nextInt()%25+60);
                }
                Student tempStudent = new Student(studentName, 160);
                tempGroup.addNewStudent(tempStudent);
            }

            ArrayList<Group> tempGroups = new ArrayList();
            tempGroups.add(tempGroup);

            Chnu.addNewCourse(tempGroups);
            Chnu.startYear();
        }
    }  
}
