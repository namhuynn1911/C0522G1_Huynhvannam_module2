package ss4_oop.exercise.FanBT3;

public class MainDemo {
    public static void main(String[] args) {
        Fan fanMedium = new Fan();
        fanMedium.setSpeed(fanMedium.getMedium());
        fanMedium.setOn(false);
        fanMedium.setColor("blue");
        fanMedium.setRadius(5);
        System.out.println("chế độ MEDIUM:"+fanMedium);

        Fan fanFanst =new Fan();
        fanFanst.setSpeed(fanFanst.getFast());
        fanFanst.setOn(true);
        fanFanst.setColor("yello");
        fanFanst.setRadius(10);
        System.out.println("chế độ FAST:"+fanFanst);
    }
}
