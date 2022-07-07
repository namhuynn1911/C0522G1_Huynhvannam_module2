package ss5_AccessModifier.practice.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    //phương thức cóntructor
    public Student(int r,String n) {
        rollno=r;
        name= n;
    }
    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }
    //phương pháp hiển thị giá trị
    void display() {
        System.out.println(rollno +" "+name+" "+college);
    }
}
