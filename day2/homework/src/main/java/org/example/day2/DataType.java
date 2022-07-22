package homework.src.main.java.org.example.day2;

/**
 * 数据类型
 */

public class DataType {
    public static void main(String[] args) {
        //基本数据类型，不属于对象
        byte b = 1; // 值为整数，0~127
        System.out.println(b);

        short s = 1; //值为整数，0~2^16-1
        System.out.println(s);

        int i = 1; // 默认整数类型，0~2^32-1
        System.out.println(i);

        long l = 1; //0~2^64-1，在数据的后面加字母（l），大小写不限
        System.out.println(l);

        float f = 1.0f; //浮点数，在数据的后面加字母（f），大小写不限
        System.out.println(f);

        double d = 1.0; //浮点数，精度比float高，默认浮点数类型
        System.out.println(d);

        //字符型，用''包裹
        char c = 'a';
        System.out.println(c);

        // 布尔类型，true = 1, false = 0
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

        /**
         * 橙色表示：java关键字（内置）
         * 橙色后面的是自己命名的【变量名】
         * 橙色关键字申明变量的数据类型
         */
        //常量
        final int finalint = 1;

        //引用数据类型，对象，由地址索引
        String str = "hello"; //字符串，可以进行相加
        String str1 = "hello" + "world";
        String str2 = "hello";
        String str3 = "world";
        String str4 = str2 + str3;
        System.out.println(str4);
        System.out.println(str1);
        //引用数据类型
        Object obj = new Object();

        //Q07
        //1.整型常量
        System.out.println(0);
        System.out.println(1);
        System.out.println(100);
        //2.小数常量
        System.out.println(0.1);
        System.out.println(99.9);
        //3.字符常量
        System.out.println('a');
        System.out.println('你');
        System.out.println('2');
        //4.字符串常量
        System.out.println("www.baidu.com");
        System.out.println("哈哈哈");
        System.out.println("hao123");
        //5.布尔常量
        System.out.println(true);
        System.out.println(false);


    }
}
