package ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.controller;


import ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.model.MyList;
import ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.model.Person;

public class MyListText {


    static class Person {
        private String name;
        private int Age;

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


    public static void main(String[] args) {
        MyList<Person> myList = new MyList<Person>(3);
        myList.ensureCapacity(4);
        myList.add(new Person("huỳnh văn nam", 29));
        myList.add(new Person("nguyễn văn phúc",24));
        myList.add(new Person("nguyễn văn phúc",24),1);






         /*  MyList<Person> myList2 = myList.clone();
            int index = myList2.indexOf(new Person("nguyễn văn phúc", 24));
        System.out.println("index ="+index);*/

        for(int i = 0;i<myList.size();i++) {
                System.out.println(myList.get(i).toString());
            }
        System.out.println();
      /*  for(int i = 0;i<myList2.size();i++) {
                System.out.println(myList.get(i).toString());
            }*/
        }
    }
