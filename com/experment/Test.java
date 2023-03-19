package com.experment;

public class Test {
    public static void main(String[] args){
        LeapYearTest(1899, 2046);
        BubbleSortTest();
        SummationTest(3,4);
    }
    private static void LeapYearTest(int startyear, int endyear) {
        for (int i = startyear; i <= endyear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }

    private static void BubbleSortTest(){
        int[] numbers = {8, 3, 4, 22, 1};
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                int temp = numbers[j];
                if (temp < numbers[i]){
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        for (int i : numbers){
            System.out.println(i);
        }
    }

    private static void SummationTest(double number, int repeat){
        double current = 0;
        double result = 0;
        for (int i = 0; i < repeat; i++){
            current = current + number * Math.pow(10, i);
            result += current;
        }
        System.out.println(result);
    }
}