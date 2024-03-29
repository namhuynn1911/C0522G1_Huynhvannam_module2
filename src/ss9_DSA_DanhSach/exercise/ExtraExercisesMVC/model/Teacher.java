package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getGender(),
                this.getSpecialize());
    }

    @Override
    public String toString() {
        return super.toString() + "specialize='" + specialize + '\'';
    }
}
