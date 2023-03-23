package com.Combination;

import com.example24.initialorder.C;
import org.example.entity.Course;
import org.example.entity.Student;
import org.example.entity.Teacher;

public class Test {
    public static void main(String[] args) {
        getPoints(createCourse());
    }

    private static Course createCourse() {
        Course c1 = new Course();
        c1.setName("Java");
        c1.setNumber(1001);
        Teacher t1 = new Teacher();
        t1.setName("BO");
        t1.setNumber(007);
        c1.setTeacher(t1);


        Student.IQ iq1 = new Student.IQ();
        iq1.setPoint(250);
        iq1.setDesc("sdfsf");

        Student s1 = new Student();
        s1.setName("LIU");
        s1.setIq(iq1);

        Student s2 = new Student();
        s2.setName("LI");
        s2.setIq(iq1);

        Student[] students = {s1, s2};
        c1.setStudents(students);
        return c1;
    }

    private static void getPoints(Course course) {
        for (Student student : course.getStudents()) {
            System.out.println(student.getIq().getPoint());
        }
        getSeasonTest(Season.SPRING);
    }

    private static void getSeasonTest(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("dfd");
                break;
            case WINTER:
                System.out.println("ssdf");
                break;
        }
    }
}
