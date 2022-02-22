package ch.spring.week01;

public class Classroom {

    Teacher teacher;
    Student[] students;
    String location;
    String name;

    public Classroom(Teacher teacher, Student[] students, String location, String name) {
        this.teacher = teacher;
        this.students = students;
        this.location = location;
        this.name = name;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
