package ss07_Abstract_Interfacce.exercise.BT2.controller;

import ss07_Abstract_Interfacce.exercise.BT2.model.Circle;
import ss07_Abstract_Interfacce.exercise.BT2.model.Rectangle;
import ss07_Abstract_Interfacce.exercise.BT2.model.Shape;
import ss07_Abstract_Interfacce.exercise.BT2.model.Square;

public class MainController {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(2, 5);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                Shape shape1 = (Square) shape;
                System.out.println(shape1.howToColor());
            }
        }
    }
}
