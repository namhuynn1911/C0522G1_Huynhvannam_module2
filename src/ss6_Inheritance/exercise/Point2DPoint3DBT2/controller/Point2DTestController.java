package ss6_Inheritance.exercise.Point2DPoint3DBT2.controller;

import ss6_Inheritance.exercise.Point2DPoint3DBT2.model.Point2D;

import java.util.Arrays;

public class Point2DTestController {

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println("array[x,y] : " + Arrays.toString(point2D.getXY()));
        point2D.setX(3);
        point2D.setY(5);
        System.out.println("array[x,y] : " + Arrays.toString(point2D.getXY()));
    }
}
