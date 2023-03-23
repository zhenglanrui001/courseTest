package com.Combination.entity;

public class Student {
    private int number;
    private String name;
    private IQ iq;

    public static class IQ {
        private int point;
        private String desc;

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public IQ getIq() {
        return iq;
    }

    public void setIq(IQ iq) {
        this.iq = iq;
    }
}
