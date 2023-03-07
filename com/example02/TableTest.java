package com.example02;

public class TableTest {
    public static void main(String[] args){
        CreatTable();
    }
    private static void CreatTable(){
        Table table1 = new Table(1.5F,0.5F,1F,"课桌");
        Table table2 = new Table(1.5F, 0.5F, 1F, "课桌");
        System.out.println(table1 == table2);
    }
}
