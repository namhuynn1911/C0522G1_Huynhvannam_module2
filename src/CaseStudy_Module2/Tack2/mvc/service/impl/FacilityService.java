package CaseStudy_Module2.Tack2.mvc.service.impl;

import CaseStudy_Module2.Tack2.mvc.exception.AreaInvalidException;
import CaseStudy_Module2.Tack2.mvc.exception.DuplicateIDException;
import CaseStudy_Module2.Tack2.mvc.exception.ServiceStandardException;
import CaseStudy_Module2.Tack2.mvc.model.Facility;
import CaseStudy_Module2.Tack2.mvc.model.House;
import CaseStudy_Module2.Tack2.mvc.model.Room;
import CaseStudy_Module2.Tack2.mvc.model.Villa;
import CaseStudy_Module2.Tack2.mvc.service.IFacilityService;
import CaseStudy_Module2.Tack2.mvc.utils.FormatName;
import CaseStudy_Module2.Tack2.mvc.utils.ReadWriteFacilityUtil;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class FacilityService implements IFacilityService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_VILLA = "src/CaseStudy_Module2/Tack2/mvc/data/villa.csv";
    private static final String PATH_ROOM = "src/CaseStudy_Module2/Tack2/mvc/data/rom.csv";
    private static final String PATH_HOUSE = "src/CaseStudy_Module2/Tack2/mvc/data/house.csv";

    @Override
    public void addVilla() {
        Map<Facility, Integer> villaIntegerMap = ReadWriteFacilityUtil.readFacilities(PATH_VILLA);
        Facility villa = infoVilla();
        villaIntegerMap.put(villa, 0);
        ReadWriteFacilityUtil.writeFileFacility(PATH_VILLA, villaIntegerMap);
        System.out.println("thêm thành công");

    }

    @Override
    public void displayService() {
        System.out.println("          ====Danh Sách Villa====");
        Map<Facility, Integer> villaIntegerMap = ReadWriteFacilityUtil.readFacilities(PATH_VILLA);
        for (Facility villa : villaIntegerMap.keySet()) {
            System.out.println(villa + "\n");
        }
        System.out.println("          ====Danh Sách Room=====");
        Map<Facility, Integer> romMap = ReadWriteFacilityUtil.readFacilities(PATH_ROOM);
        for (Facility room : romMap.keySet()) {
            System.out.println(room + "\n");
        }
        System.out.println("          ====Danh Sách House=====");
        Map<Facility, Integer> houseMap = ReadWriteFacilityUtil.readFacilities(PATH_HOUSE);
        for (Facility house : houseMap.keySet()) {
            System.out.println(house + "\n");
        }
    }

    @Override
    public void addHouse() {
        Map<Facility, Integer> houseMap = ReadWriteFacilityUtil.readFacilities(PATH_HOUSE);
        String serviceId;
        while (true) {
            try {
                System.out.println("mời bạn nhập vào mã dịch vụ");
                serviceId = SCANNER.nextLine();
                if (!serviceId.matches("SVH-\\d{4}")) {
                    throw new ServiceStandardException("Mã dịch vụ phải đúng định dạng: SVH-YYYY, với YYYY là các số từ 0-9");
                }
                for (Facility house : houseMap.keySet()) {
                    if (serviceId.equals(house.getServiceId())) {
                        throw new DuplicateIDException("Mã dịch vụ đã tồn tại,mời nhập lại");
                    }
                }
                break;
            } catch (ServiceStandardException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập name: ");
        String name = SCANNER.nextLine();
        String serviceName = FormatName.getName(name);

        int usableArea = getUsableArea();

        double rent = getRent();

        int amountMax = getAmountMax();

        System.out.println("nhập vào kiểu thuê ngày hoặc tháng hoặc năm");
        String serviceType = SCANNER.nextLine();
        String time = FormatName.getName(serviceType);

        System.out.println("nhập vào tiêu chuẩn phòng:");
        String standardType = SCANNER.nextLine();
        String standard = FormatName.getName(standardType);

        int floorNumber = getFloorNumber();

        houseMap.put(new House(serviceId, serviceName, usableArea, rent, amountMax, time, standard, floorNumber), 0);
        ReadWriteFacilityUtil.writeFileFacility(PATH_HOUSE, houseMap);
    }

    @Override
    public void addRom() {
        Map<Facility, Integer> roomMap = ReadWriteFacilityUtil.readFacilities(PATH_ROOM);
        String serviceId;
        while (true) {
            try {
                System.out.println("mời bạn nhập vào mã dịch vụ");
                serviceId = SCANNER.nextLine();
                if (!serviceId.matches("SVR-\\d{4}")) {
                    throw new ServiceStandardException("Mã dịch vụ phải đúng định dạng: SVR-YYYY, với YYYY là các số từ 0-9");
                }
                for (Facility room : roomMap.keySet()) {
                    if (serviceId.equals(room.getServiceId())) {
                        throw new DuplicateIDException("Mã dịch vụ đã tồn tại,mời nhập lại");
                    }
                }
                break;
            } catch (ServiceStandardException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập vào tên dịch: ");
        String name = SCANNER.nextLine();
        String serviceName = FormatName.getName(name);

        int usableArea = getUsableArea();

        double rent = getRent();

        int amountMax = getAmountMax();

        System.out.println("nhập vào kiểu thuê ngày hoặc tháng hoặc năm");
        String serviceType = SCANNER.nextLine();
        String time = FormatName.getName(serviceType);

        System.out.println("nhập dịch vụ miễn phí vào: ");
        String freeService=SCANNER.nextLine();

        roomMap.put(new Room(serviceId,serviceName,usableArea,rent,amountMax,time,freeService),0);
        ReadWriteFacilityUtil.writeFileFacility(PATH_ROOM,roomMap);

    }

    @Override
    public void displayMaintenance() {
        System.out.println("===DANH SÁCH BẢO TRÌ CỦA VILLA===");
        Map<Facility, Integer> villaIntegerMap = ReadWriteFacilityUtil.readFacilities(PATH_VILLA);
        Set<Facility> keys=villaIntegerMap.keySet();
        for (Facility key:keys) {
            if(villaIntegerMap.get(key)>=5) {
                System.out.printf("%s : %s\n",key,villaIntegerMap.get(key));
            }
        }

        System.out.println("===DANH SÁCH BẢO TRÌ CỦA HOUSE===");
        Map<Facility, Integer> houseMap = ReadWriteFacilityUtil.readFacilities(PATH_HOUSE);
        Set<Facility> keyHouse=houseMap.keySet();
        for (Facility key:keyHouse) {
            if(houseMap.get(key)>=5) {
                System.out.printf("%s : %s\n",key,houseMap.get(key));
            }
        }

        System.out.println("===DANH SÁCH BẢO TRÌ CỦA ROOM===");
        Map<Facility, Integer> roomMap = ReadWriteFacilityUtil.readFacilities(PATH_ROOM);
        Set<Facility> keyRoom=roomMap.keySet();
        for (Facility key:keyRoom) {
            if(roomMap.get(key)>=5) {
                System.out.printf("%s : %s\n",key,roomMap.get(key));
            }
        }
    }

    public double getRent() {
        double rent;
        while (true) {
            try {
                System.out.println("nhập vào tiền thuê phòng: ");
                rent = Double.parseDouble(SCANNER.nextLine());
                if (rent < 0) {
                    throw new AreaInvalidException("Tiền thuê phải lớn hơn 0");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        return rent;
    }

    public int getAmountMax() {
        int amountMax;
        while (true) {
            try {
                System.out.println("nhập vào số người thuê tối đa: ");
                amountMax = Integer.parseInt(SCANNER.nextLine());
                if (amountMax < 0 || amountMax > 20) {
                    throw new AreaInvalidException("số lương tối đa là lớn 0 và nhỏ hơn hoặc bằng 20 người");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }

        }
        return amountMax;
    }

    public static int getUsableArea() {
        int usableArea;
        while (true) {
            try {
                System.out.println("nhập vào diện tích sử dụng:");
                usableArea = Integer.parseInt(SCANNER.nextLine());
                if (usableArea <= 30) {
                    throw new AreaInvalidException("diện tích sử dụng phải lớn hơn 30m2");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e) {
                System.out.println("phải nhập số");
            }
        }
        return usableArea;
    }

    public int getFloorNumber() {
        int floorNumber;
        while (true) {
            try {
                System.out.println("nhập vào số lầu: ");
                floorNumber = Integer.parseInt(SCANNER.nextLine());
                if (floorNumber < 0 || floorNumber > 20) {
                    throw new AreaInvalidException("số lương tối đa là lớn 0 và nhỏ hơn hoặc bằng 20 người");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }

        }
        return floorNumber;
    }


    public static Facility infoVilla() {
        Map<Facility, Integer> villaIntegerMap = ReadWriteFacilityUtil.readFacilities(PATH_VILLA);
        String serviceId;
        while (true) {
            try {
                System.out.println("nhập vào mã dịch vụ");
                serviceId = SCANNER.nextLine();
                if (!serviceId.matches("SVVL-\\d{4}")) {
                    throw new ServiceStandardException("Mã dịch vụ phải đúng định dạng: SVVL-YYYY, với YYYY là các số từ 0-9");
                }
                for (Facility villa : villaIntegerMap.keySet()) {
                    if (serviceId.equals(villa.getServiceId())) {
                        throw new DuplicateIDException("mã dịch vụ bị tồn tại");
                    }
                }
                break;
            } catch (DuplicateIDException | ServiceStandardException e) {
                System.out.println(e.getMessage());
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("mời bạn nhập vào tên dịch vụ:");
                serviceName = SCANNER.nextLine();
                if (!serviceName.matches("[A-Z][a-z]+")) {
                    throw new ServiceStandardException("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                }
                break;
            } catch (ServiceStandardException e) {
                System.out.println(e.getMessage());
            }
        }

        int usableArea=getUsableArea();


        System.out.println("nhập vào tiền thuê:");
        double rent = Double.parseDouble(SCANNER.nextLine());

        System.out.println("nhập vào tiền thuê cao nhất:");
        int amountMax = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Nhập vào loại thuê");
        String time = SCANNER.nextLine();

        System.out.println("mời bạn nhập vào tiêu chuẩn:");
        String standard = SCANNER.nextLine();

        System.out.println("nhập vào diện tích hồ bơi:");
        double poolArea = Double.parseDouble(SCANNER.nextLine());

        System.out.println("nhập vào số lầu:");
        int floorNumber = Integer.parseInt(SCANNER.nextLine());

        return new Villa(serviceId, serviceName, usableArea, rent, amountMax, time, standard, poolArea, floorNumber);
    }

}
