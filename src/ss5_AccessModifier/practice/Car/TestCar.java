package ss5_AccessModifier.practice.Car;

public class TestCar {
    public static void main(String[] args) {
        Car car1= new Car("mada_cx5","skyactic 5");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("GLC 450","German");
        System.out.println(Car.numberOfCar);
    }
}
