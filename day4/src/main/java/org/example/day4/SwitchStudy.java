package org.example.day4;

public class SwitchStudy {
    public static void main(String[] args) {
        int a = 1;

        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("300");
                break;
            default:   //不要default也可以
                System.out.println("default");
                break;
        }
    }
}
