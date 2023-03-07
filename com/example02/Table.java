package com.example02;

public class Table {
    private float length;
    private float width;
    private float height;
    private String type;

    public Table(float length, float width, float height, String type) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

}
