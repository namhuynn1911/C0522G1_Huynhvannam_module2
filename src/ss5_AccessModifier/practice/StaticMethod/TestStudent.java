package ss5_AccessModifier.practice.StaticMethod;

public class TestStudent {
    public static void main(String[] args) {
        Student.change();//gọi phương thức thay đổi
        //tạo đối tượng
        Student s1=new Student(111,"huynh");
        Student s2=new Student(222,"van");
        Student s3=new Student(333,"nam");
        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
