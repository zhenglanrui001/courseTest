package com.example04;
public class StaticTest {
    public static void main(String[] args){
        Student student = new Student("wang", 18, Student.FEMALE);
        System.out.println(student.getName());
        System.out.println(student.getSex());
    }
}
