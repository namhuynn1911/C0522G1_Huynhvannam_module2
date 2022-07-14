package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model;

public class Student extends Person {
    private String classes;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender, String classes, double point) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + " classes='" + classes + '\'' +
                ", point=" + point ;
    }
}
