package Students;

public class Student {
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

    public String[] getSubjects() {
        return subjects;
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

    public String toCSV(){
        return id + ", " + name + ", " + age + ", " + subjects;
    }

    public Student fromCSV(String data) {
        String[] data_parts = data.split(",");
        int id = Integer.parseInt(data_parts[0]);
        String name = data_parts[1];
        int age = Integer.parseInt(data_parts[2]);
        String[] subjects = new String[]{data_parts[3]};
        return new Student(id, name, age, subjects);
    }
}
