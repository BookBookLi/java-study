package org.example.day4;

/**
 * 二维数组
 */
public class ArrStudy {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        //[ [0,1,2,3],[0,1,2,3],[0,1,2,3] ]



        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = i * j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }

        /*
        int[][] arr2 = new int[3][];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr2[i][j] + "");
            }
            System.out.println();
        }
         */




    }
}
