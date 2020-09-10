package learning.java.school;

import java.util.Scanner;
//import java.util.regex.Pattern;

public class Application {

    public static void main(String[] args) {

        //No poner name ni code en los parametros
        //Pirntln es para porner una linea al final
        Student []students = new Student[]{
            new Student("Isaias","1"),
            new Student("Edgar", "2"),
            new Student("Alain", "3"),
            new Student("Caleb","4")
        };

        System.out.println("Los alumnos son...");
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < students.length; i++)
        {
            System.out.println(students[i].getName() + "-" + students[i].getCode() );

            System.out.print("Asistió?: ");
            String response = scanner.next("[YNyn]");
            
            System.out.println(students[i].getName() + (response.equalsIgnoreCase("Y") ? "Si" : "No"));
        }

    }
}