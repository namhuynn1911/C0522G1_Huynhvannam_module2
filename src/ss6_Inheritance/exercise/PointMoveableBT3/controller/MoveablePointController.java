package ss6_Inheritance.exercise.PointMoveableBT3.controller;


import ss6_Inheritance.exercise.PointMoveableBT3.model.MoveablePoint;

public class MoveablePointController {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 2);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(1, 2, 3, 4);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
    }
}