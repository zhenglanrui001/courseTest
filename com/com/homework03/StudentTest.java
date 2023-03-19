package com.com.homework03;

import com.com.homework03.entity.Student;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student(2046, "张凡", "male", 18);
        student.setNumber(2059);
        System.out.println("学生姓名：" + student.getName());
        System.out.println("学生性别：" + student.getSex());
        System.out.println("学生学号：" + student.getNumber());
        System.out.println("学生年龄：" + student.getAge());
    }
}
