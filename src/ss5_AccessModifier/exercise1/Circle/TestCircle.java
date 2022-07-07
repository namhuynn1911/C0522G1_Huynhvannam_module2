package ss5_AccessModifier.exercise1.Circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle= new Circle(10.0);
        System.out.println("đường kính:"+circle.getRadius());
        System.out.println("diện tích hình tròn:" +circle.getArea());
    }
}
