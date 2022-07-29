package org.example.day3;

import java.util.Arrays;
import java.util.Scanner;

public class InputStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a " + a);

        String str1 = scanner.nextLine();
        System.out.println("str1 " + str1);

        String str2 = scanner.next();
        System.out.println("str2 " + str2);

        //next() 与 nextLine() 区别
        //next():
        //1、一定要读取到有效字符后才可以结束输入。
        //2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
        //3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
        //next() 不能得到带有空格的字符串。
        //nextLine()：
        //1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
        //2、可以获得空白。

        // 连续输入数字和字符串
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String str = sc.next();
            if (str.isEmpty())
                break;
            System.out.println("n = " + n);
            System.out.println("str = " + str);
        }
        sc.close();

        // 多行
        System.out.println("输入：");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        int n = sc1.nextInt();
        int[] num1 = new int[m];
        int[] num2 = new int[n];
        // 换成其他数据类型也一样，其他数值类型就修改int跟nextInt就可以了，
        //String就把nextInt()换成next()
        for(int i = 0; i < m; i ++) {
            num1[i] = sc1.nextInt();  // 一个一个读取
        }
        for(int i = 0; i < n; i ++) {
            num2[i] = sc1.nextInt();
        }
        System.out.println("输出：");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }


}
