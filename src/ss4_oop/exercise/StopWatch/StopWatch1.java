package ss4_oop.exercise.StopWatch;

import java.util.Date;

public class StopWatch1 {
    private Date startTime, endTime;

    StopWatch1() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime  () - startTime.getTime();
    }
}