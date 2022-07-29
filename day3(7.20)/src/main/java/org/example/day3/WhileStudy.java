package org.example.day3;

import java.util.Scanner;

public class WhileStudy {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        int b = 0;
        while (b < 10){
            if (b %3 == 1){
                break;
            }
            System.out.println(b);
            b++;
            if (b == 5){
                continue;
            }
            System.out.println(b + "1");
        }


        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a > 0){
            System.out.println("hello");
        }
        System.out.println("end");

        do {
            System.out.println(i);
        }while (i > 0);
    }
}
