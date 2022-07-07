package ss5_AccessModifier.exercise.Student2;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public String getClasses() {
        return classes;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }
    String display() {
      return "name : "+getName()+"\n"+"classes : "+getClasses();
    }
}
