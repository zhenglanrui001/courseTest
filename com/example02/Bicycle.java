package com.example02;

public class Bicycle {
    int cadence;
    int speed;
    int gear;
    //改变频率
    void changeCadence(int newvalue){
        cadence = newvalue;
    }
    //改变速度
    void changeSpeed(int newvalue){
        speed = newvalue;
    }
    //改变档位
    void changeGear(int newvalue){
        gear = newvalue;
    }
}

