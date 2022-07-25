package CaseStudy_Module2.Tack2.mvc.model;

import CaseStudy_Module2.Tack2.mvc.model.Facility;

public class Room extends Facility {
private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return null;
    }

    public Room(String serviceName, int usableArea, double rent, int amountMax, String time, String freeService) {
        super(serviceName, usableArea, rent, amountMax, time);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room" +
                "freeService='" + freeService + '\'';
    }
}
