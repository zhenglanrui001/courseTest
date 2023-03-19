package com.example04;

public class Student {
    private String name;
    private int age;
    private String sex;
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Student student01 = new Student("Bo", 18, Student.MALE);
        Student student02 = new Student("sun", 19, Student.FEMALE);
        System.out.println(student01.getName());
        System.out.println(student01.getSex());
    }
}
