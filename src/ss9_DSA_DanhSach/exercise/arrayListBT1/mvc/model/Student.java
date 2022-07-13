package ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.model;

public class Student extends Person {
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
