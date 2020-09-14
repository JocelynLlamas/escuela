package learning.java.school;

import learning.java.school.model.Group;
import learning.java.school.model.Professor;
import learning.java.school.model.Student;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Group[] groups = prepareOOPGroups();

        for (Group group : groups) {
            System.out.println("Profesor: " + group.getProfessor().getName());
            System.out.println("Cupo: " + group.getAvailability() + ", Inscritos: " + group.getEnrolled());
            System.out.println("Students: ");
            group.printStudentsList();
            System.out.println("---------------------------------------");
        }

        groups[1].addStudent(new Student("Caleb", "asd"));

    }

    public static Group[] prepareOOPGroups() {
        Group[] groups = new Group[2];
        Professor professorIvan = new Professor();
        Professor professorPaco = new Professor();

        professorIvan.setName("Ivan Uresti");
        professorPaco.setName("Paco Torres");

        groups[0] = new Group(20);
        groups[1] = new Group(15, professorIvan);

        groups[0].setProfessor(professorPaco);

        groups[0].addStudent(new Student("Isaias", "100"));
        groups[1].addStudent(new Student("Arturo", "201"));
        groups[0].addStudent(new Student("Angel", "101"));
        groups[1].addStudent(new Student("Jocelyn", "202"));
        groups[0].addStudent(new Student("Jose", "102"));
        groups[1].addStudent(new Student("Alain", "200"));
        groups[1].addStudent(new Student("Antonio", "203"));

        return groups;

    }
}


