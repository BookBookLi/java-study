package org.example.day3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        //Q02 【if条件判断】
        //1.定义变量
        double price1 = 7988; // 新手机的标价
        double price2 = 1500; // 旧手机的卖价
        double discount = 0.8; // 以旧换新的折扣
        //2.计算不使用以旧换新的时的花费
        double cost1 = price1 - price2;
        //3.计算使用以旧换新的时的花费
        double cost2 = price1 * discount;
        //4.比较并输出结果
        if (cost1 >= cost2) {
            System.out.println("使用以旧换新更省钱，所需花费为：" + cost2);
        } else {
            System.out.println("不使用以旧换新更省钱，所需花费为：" + cost1);
        }

        //Q03 【if条件判断】
        //1.输入年龄
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc1.nextInt();
        //2.判断用户年龄段
        if (age > 0 && age < 5) {
            System.out.println("您是婴幼儿");
        } else if (age >= 5 && age < 10) {
            System.out.println("您是儿童");
        } else if (age >= 10 && age < 18) {
            System.out.println("您是青少年");
        } else if (age >= 18 && age < 30) {
            System.out.println("您是青年人");
        } else if (age >= 30 && age < 40) {
            System.out.println("您是青壮年");
        } else if (age >= 40 && age < 50) {
            System.out.println("您是中年人");
        } else if (age >= 50 && age < 70) {
            System.out.println("您是中老年人");
        } else if (age >= 70 && age < 100) {
            System.out.println("您是老年人");
        } else if (age >= 100 && age < 140) {
            System.out.println("您是长寿老人");
        } else {
            System.out.println("您应该记错了");
        }

        //Q04【java for循环】
        for(int i = 1949; i <=2019; i++){
            if ((2019 - i ) % 12 == 0){
                System.out.println(i + "年是猪年");
            }
        }

        //Q05【java for循环】
        for (int i = 2000; i<=2019; i++){
            if ( i % 4 == 0 && i % 100 != 0){
                System.out.println(i + "年是闰年");
            } else if ( i % 400 == 0) {
                System.out.println(i + "年是闰年");
            }
        }

        //Q06【java for循环】
        int sum1 = 0;
        for (int i = 2; i <= 100; i += 2){
            sum1 += i;
        }
        System.out.println("1-100的偶数和是：" + sum1);

        //Q07【java for循环】
        for (int i = 100; i <= 999; i++){
            int a = i % 10; //定义个位数字
            int b = (i - a)/10 % 10; //定义十位数字
            int c = (i - a - b*10 ) /100 % 10; //定义百位数字
            //判断是否为水仙花数
            if (a*a*a + b*b*b + c*c*c == i){
                System.out.println(i + "是一个水仙花数字");
            }
        }

        //Q08【Java for循环嵌套】
        for (int i = 1; i <= 4; i++){     //外层循环
            for (int j = 1; j <= 5; j++){      //内层循环，打印行
                System.out.print("@");
            }
            System.out.println();
        }

        //Q09【Java for循环嵌套】
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("@");
            }
            System.out.println();
        }

        //Q10【java break】
        int sum2 = 0;
        for (int i = 1; i <= 5; i++){
            if (i == 4){
                break;
            }
            sum2 +=i;
        }
        System.out.println("1+2+3的结果是：" + sum2);

        //Q11【java while 循环】
        int i1 = 1;
        int sum3 = 0;
        while (i1 <= 10){
            sum3 += i1;
            i1++;
        }
        System.out.println("1到10的和为：" + sum3);

        //Q12【java do while 循环】
        int i = 1;
        int sum4 = 0;
        do {
            sum4 += i;
            i++;
         }while(i <= 10);
        System.out.println("1到10的和为：" + sum4);

        //Q13【java 死循环】
        //1.创建一个键盘输入扫描类对象
        Scanner sc2 = new Scanner(System.in);
        //2.定义死循环
        while (true){
            System.out.println("请输入学生成绩：");
            sc2.nextInt();
        }











    }
}

