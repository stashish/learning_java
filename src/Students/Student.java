package Students;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String[] subjects;

    public Student(int id, String name, int age, String[] subjects){
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String subjects() {
        return subjects();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Roll No: " + id +
                "Name: " + name +
                "Age: " + age +
                "Subjects: " + subjects;
    }
}
