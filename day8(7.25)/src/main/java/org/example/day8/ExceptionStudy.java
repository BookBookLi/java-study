package org.example.day8;

import java.util.Random;

public class ExceptionStudy {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            System.out.println("错误" + e.getMessage());
        }

        double b = 10.0;
         for (int i = 0; i < 10; i++){
             try {
                 double c = b / new Random().nextInt(2);
                 System.out.println(c);
             }catch (Exception e){  //具体的 ArithmeticException e
                 System.out.println("error");
             }finally {
                 System.out.println("finally"); //不管有无异常都执行
             }
             //可以有多个catch语句
//             catch (ArrayStoreException e){  //具体的 ArithmeticException e
//                 System.out.println("error");
//             }catch (ArithmeticException e){  //具体的 ArithmeticException e
//                 System.out.println();
//             }



         //会报错
//             for (int i = 0; i < 10; i++){
//                     double c = b /new Random().nextInt(2);
//                     System.out.println(c);
//
//                 }
//
         }

    }
}
