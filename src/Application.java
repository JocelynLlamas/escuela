class Professor {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class Group {
    private Professor professor;
    private int availability;
    private Student[] students;

    Group(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

}

public class Application {

    public static void main(String[] args) {

    }
}
