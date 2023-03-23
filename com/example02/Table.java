package com.example02;
//import com.example02.Bicycle
public class Table {
    private float length;
    private float width;
    private float height;
    private String type;
    Bicycle bicycle = new Bicycle();

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

    public float setLength(int newvalue) {
        length = newvalue;
        return length;
    }

    public float setWidth(int newvalue) {
        width = newvalue;
        return width;
    }
}

