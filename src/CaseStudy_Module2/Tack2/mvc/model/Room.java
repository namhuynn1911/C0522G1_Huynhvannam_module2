package CaseStudy_Module2.Tack2.mvc.model;


public class Room extends Facility {
private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.getServiceId(),this.getServiceName(),this.getUsableArea(),this.getRent(),
                this.getAmountMax(),this.getTime(),this.getFreeService());
    }

    public Room(String serviceId, String serviceName, int usableArea, double rent, int amountMax, String time, String freeService) {
        super(serviceId, serviceName, usableArea, rent, amountMax, time);
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
        return super.toString() +
                " freeService='" + freeService ;
    }
}
