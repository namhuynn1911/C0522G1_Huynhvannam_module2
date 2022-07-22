package ss16_io_text_file.practice.demo_copy_file_text.model;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String getInfo() {
        return String.format("%s,%s,%s \n",this.getId(),this.getName(),this.getScore());
    }

    @Override
    public String toString() {
        return " \nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
