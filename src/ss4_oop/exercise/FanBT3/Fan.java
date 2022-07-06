package ss4_oop.exercise.FanBT3;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan() {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSlow() {
        return SLOW;
    }
    public int getMedium() {
        return MEDIUM;
    }
    public int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    private boolean isOn() {
        return on;
    }

    void setOn(boolean newOn) {
        this.on = newOn;
    }

    private double getRadius() {
        return radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    private String getColor() {
        return color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius()+"quạt đang bật";
        }
        return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius()+"quạt dang tắt";
    }

}
