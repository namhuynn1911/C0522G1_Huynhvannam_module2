package ss6_Inheritance.exercise.Point2DPoint3DBT2.controller;

import ss6_Inheritance.exercise.Point2DPoint3DBT2.model.Point3D;

import java.util.Arrays;

public class Point3DTestController {


    public static void main(String[] args) {

        Point3D point3D = new Point3D(2, 5, 6);
        System.out.println("array[x,y,z] =" + Arrays.toString(point3D.getXYZ()));
    }
}
