package ch.spring.week01;

public class RegisterApp {

    public static void main(String[] args) {

        Student[] students = new Student[10];
        Teacher engTeacher = new Teacher();
        Teacher mathTeacher = new Teacher();

        engTeacher.setSpeciality("English");
        mathTeacher.setSpeciality("Math");

        Classroom classroom = new Classroom(engTeacher,students,"Berlin-45","English Class");


    }

}
