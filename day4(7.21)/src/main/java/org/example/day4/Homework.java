package org.example.day4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
    //Q01
        //1.定义取最大值的方法
        //2.输入三个整数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入要比较的三个整数为：");
        System.out.print("a = ");
        int a = sc1.nextInt();
        System.out.print("b = ");
        int b = sc1.nextInt();
        System.out.print("c = ");
        int c = sc1.nextInt();
        //3.调用 getMax 方法，获取最大值
        int result1 = getMax(a,b,c);
        //4.打印结果
        System.out.println("这三个整数中最大的是：" + result1);

    //Q02
        //1.定义取绝对值的方法
        //2.输入数字
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入需要获取绝对值的数：");
        double num = sc2.nextDouble();
        //3.调用getNum方法，获得最大值
        double result2 = getNum(num);
        System.out.println("该数字的绝对值为：" + result2);

    //Q03
        //1.创建逢7过的方法
        //2.运行
        doGame();

    //Q04
        //1.创建获取兔子对数的方法
        //2.运行
        getNumber();

    }

    //1.取最大值的方法
    public static int getMax(int a,int b, int c){
        // 定义 max 变量
        int max = a;
        // if 条件判断出最大值
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        // 返回最大值
        return max;

    }
    //2.取绝对值的方法
    public static double getNum(double num){
        if (num >= 0){
            return num;
        } else {
            return num * (-1);
        }
    }
    //3.逢7过的方法
    public static void doGame() {
        // 使用 for 循环获取 1 到 20 的数
        for (int i = 1; i <= 20; i++) {
            // 判断数字是否是7的倍数或者含数字7
            if (i % 7 == 0 || i % 10 == 7 ) {
                System.out.println(" 过！");
            }
        }
    }
    //4.获取兔子对数的方法
    public static void getNumber(){
        // 创建一个数组存放兔子每个月数量
        int [] arr = new int [20];
        // 前两个月兔子对数都为1
        arr [0] = arr [1] = 1;
        for(int i = 2;i < arr.length;i++){
            arr[i] = arr [i-1] + arr[i - 2];
        }
        // 打印第二十个月的兔子对数
        System.out.println("第二十个月的兔子对数为: " + arr[19]);
    }





}
