package com.com.homework03.entity;

public class Student {
    private int number;
    private String name;
    private String sex;
    private int age;
    public Student(int number, String name, String sex, int age){
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
