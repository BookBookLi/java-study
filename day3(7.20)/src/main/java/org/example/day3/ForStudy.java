package org.example.day3;

public class ForStudy {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++){
            if (i % 2 ==1){
                continue;
            }
            System.out.println(i);
        }

        // 1加到100的结果
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);



    }
}
