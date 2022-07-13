package ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.model;

import ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.controller.MyListText;

public abstract class Person {
    private String name;
    private int Age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person=(Person) obj;
        return this.name.equals(((Person) obj).name)&&this.Age==((Person) obj).Age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}

