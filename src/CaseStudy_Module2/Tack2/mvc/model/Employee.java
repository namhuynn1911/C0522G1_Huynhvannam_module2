package CaseStudy_Module2.Tack2.mvc.model;

public class Employee extends Person {
private String academicLevel;
private String position;
private double salary;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s \n",this.getCode(),this.getName(),this.getDateOfBirth(),this.getGender(),
                this.getId(),this.getNumberPhone(),this.getEmail(),this.getAcademicLevel(),this.getPosition(),this.getSalary());
    }

    public Employee(String code, String name, String dateOfBirth, String gender, int id,
                    String numberPhone, String email, String academicLevel, String position, double salary) {
        super(code, name, dateOfBirth, gender, id, numberPhone, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }
}

