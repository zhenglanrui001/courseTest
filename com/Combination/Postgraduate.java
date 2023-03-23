package com.Combination;

public class Postgraduate implements Learnable {
    @Override
    public int test(String courseName) {
        return 80;
    }

    @Override
    public void read(String name) {
        System.out.println("Postgraduate");
    }
}
