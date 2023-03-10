package com.example03;
public class ControllFlow {
    public static void main(String[] args){
        System.out.println("----if else----");
        //getIfThenElse()
        getIfThenElse();

        System.out.println("----switch----");
        //getSwitch()
        getSwitch();
        System.out.println("---switch string----");
        //getSwitchString()
        getSwitchString();

        System.out.println("----while----");
        //getWhile()
        getWhile();

        System.out.println("----for----");
        //getFor()
        getFor();
        System.out.println("----for each----");
        //getForEach()
        getForEach();

        System.out.println("----break----");
        //getBreak()
        getBreak();
        //getBreak2()
        getBreak2();
        //getBreakWithLable()
        getBreakWithLable();


        System.out.println("----continue----");
        //getContinue()
        getContinue();

        System.out.println("----return----");
        //getReturn()
        getReturn();


    }

    /*
    *基于if else语句
     */
    private static void getIfThenElse(){
        boolean moving = true;
        int gear = 5;
        int speed = 60;
        if (moving){
            System.out.println("Moving");
            if (gear >= 5 && speed >= 60){
                System.out.println("Speeding");
            }else{
                System.out.println("Normal");
            }
        }else{
            System.out.println("Stopped");
        }

        int testscore = 90;
        char grade;
        if (testscore >= 90){
            grade = 'A';
        }else if (testscore >= 80){
            grade = 'B';
        }else if (testscore >= 70){
            grade = 'C';
        }else if (testscore >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Grade = "+ grade);
    }

    /*
    基于switch语句
     */
    private static void getSwitch(){
        int season = 1;
        switch (season){
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            //当都不匹配时，执行default中代码
            default:
                System.out.println("Invalid season");
                break;
        }
    }
    /*
    支持字符串的switch语句
     */
    private static void getSwitchString(){
        String season = "Spring";
        switch (season){
            case "Spring":
                System.out.println("花儿开啦！");
            case "Autumn":
                System.out.println("我喜欢" + season + "凉爽的天气！");
                break;
            case "Summer":
                System.out.println("虽然可以游泳,但是");
            case "Winter":
                System.out.println("我不喜欢" + season + "极端的天气!");
                break;
            //当以上都不匹配，执行default语句
            default:
                System.out.println("Imvalid season");
                break;
        }
    }

    /*
    while循环
     */
    private static void getWhile(){
        int count = 1;
        while (count <= 5){
            System.out.println("Count is : " + count);
            count++;
        }
        //do while语句
        /*
        代码从上到下执行，但是条件判断在下面
        因此do代码模块必然执行一次
        即会输出：Count is 6
         */
        do{
            System.out.println("Count is : " + count);
            count++;
        }while (count <= 5);
    }

    /*
    for循环
     */
    private static void getFor(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Count is : " + i);
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int j = 0; j < numbers.length; j++){
            System.out.println("Count is :" + j);
        }
    }
    /*
    for each循环
     */
    private static void getForEach(){
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i: numbers){
            System.out.println("number : " + i);
        }
    }

    /*
    break语句
     */
    private static void getBreak(){
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers){
            System.out.println("number is : " + i );
            if (i == 3){
                break;
            }
        }
    }
    /*
    双重循环中的break
    输出重复的数
     */
    private static void getBreak2(){
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] num2 = {2, 3, 5, 8, 11};
        for (int i : num1){
            for (int j : num2){
                if (i == j){
                    System.out.println("重复数字：" + i);
                    break;
                }
            }
        }
    }
    /*
    break指定循环层
     */
    private static void getBreakWithLable(){
        int[] num1 = {1,2,3,4,5,6,7,8,9};
        int[] num2 = {2,3,5,8,11,19};
        first:
        for (int i : num1){
            second:
            for (int j : num2){
                if (i == j){
                    System.out.println("相同数字为：" + i);
                    break first;
                }
            }
        }
    }

    /*
    基于continue语句
     */
    private static void getContinue(){
        int[] number={1,2,3,4,5,6,7,8,9};
        for (int i : number){
            if (i == 5){
                continue;
            }
            System.out.println("The number is : " + i);
        }
    }

    /*
    基于return语句
    return终止当前方法，将控制流程返回到调用该方法处（main函数）
     */
    private static void getReturn(){
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 3){
                return;
            }
            System.out.println("返回的数：" + numbers[i]);
        }
    }

}
