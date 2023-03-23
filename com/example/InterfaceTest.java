package com.example;

public class InterfaceTest {
    public static void main(String[] args) {
        Playable p1 = new Undergradute("BO");
        p1.sing("sdfsf");

        Learnable p2 = new Postgraduate();
        Learnable p3 = new Undergradute("SUN");
        Club club = new Club();
        club.setPlayable(p1);
        club.setLearnable(p2);
    }
}
