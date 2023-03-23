package com.example;

public class Undergradute implements Playable, Learnable{
    private String name;

    public Undergradute(String name) {
        this.name = name;
    }

    @Override
    public void sing(String name) {
        System.out.println(this.name + " is singing.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int test(String courseName) {
        return 100;
    }

    @Override
    public void read(String name) {
        System.out.println("name");
    }
}
