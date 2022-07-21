package ss15_exception_debug.exercise.triangleException.mbcBT1.model;

public class Triangle {
    private int firstEdge;
    private int secondEdge;
    private int thirdEdge;

    public Triangle() {
    }

    public Triangle(int firstEdge, int secondEdge, int thirdEdge) throws IllegalTriangleException {
        boolean checkCondition = (firstEdge >= 0 && secondEdge >= 0 && thirdEdge >= 0
                && (firstEdge + secondEdge > thirdEdge) && (firstEdge + thirdEdge > secondEdge)
                && (thirdEdge + secondEdge > firstEdge));
        if (!checkCondition) {
            throw new IllegalTriangleException("ngoại lệ.không phải là ba cạnh cảu một tam giác");
        } else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }


    public int getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    public int getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "firstEdge=" + firstEdge +
                ", secondEdge=" + secondEdge +
                ", thirdEdge=" + thirdEdge;
    }
}
