package ss07_Abstract_Interfacce.exercise.BT1.controller;

import ss07_Abstract_Interfacce.exercise.BT1.model.Circle;
import ss07_Abstract_Interfacce.exercise.BT1.model.Rectangle;
import ss07_Abstract_Interfacce.exercise.BT1.model.Shape;
import ss07_Abstract_Interfacce.exercise.BT1.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("green", true, 5);
        shape[1] = new Rectangle(2, 5, "red", false);
        shape[2] = new Square(10, "blue", true);

        double percent =Math.floor(Math.random() * 100) + 1;
        for (Shape shape1 : shape) {
            System.out.println(shape1 + "\n AREA: " + shape1.getArea());

        }
        System.out.println("\npercent: " + percent + "%\n");

        System.out.println("After resize: ");
        for (Shape shape1 : shape) {
            shape1.resize(percent);
            System.out.println(shape1 + "\n AREA: " + shape1.getArea());
        }
    }
}
