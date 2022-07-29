package org.example.day3;

/**
 *
 */
public class StringStudy {
    public static void main(String[] args) {
        // 构建字符串
        String str1 = "hello world";
        System.out.println(str1);
        // 字符串拼接
        String str2 = "hello" + " world";
        String str3 = "hello" + "world";
        String str4 = "hello" + " " + "world";
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        // 字符串拼接 创建新对象  申明并初始化
        String str5 = new String("hello world");

        // 1、int length();
        // 语法：字符串变量名.length();
        // 返回值为 int 类型。得到一个字符串的字符个数（中、英、空格、转义字符皆为字符，计入长度）
        System.out.println(str5.length());

        // 2、char charAt(值);
        // 语法 ：字符串名.charAt(值);　　
        // 返回值为 char 类型。从字符串中取出指定位置的字符
        System.out.println(str5.charAt(str5.length()-1));
        System.out.println(str5.charAt(4));

        // 3、char toCharArray();
        // 语法 ：字符串名.toCharArray();
        // 返回值为 char 数组类型。将字符串变成一个字符数组
        String str6 = "星期一";
        char ch[] = str6.toCharArray();
        for (int i = 0; i < ch.length; i++)
            System.out.println("转为数组输出:" + ch[i]);

        // 4、 int indexOf(“字符”)
        // 语法 ：字符串名.indexOf(“字符”)；字符串名.indexOf(“字符”,值)；查找一个指定的字符串是否存在，
        // 返回的是字符串的位置，如果不存在，则返回-1 。
        System.out.println(str5.indexOf('o'));
        String str = "I am a good student";
        int a = str.indexOf('a'); //a = 2
        int b = str.indexOf("good"); //b = 7
        // 从指定位置往后查，第一次出现
        int c1 = str.indexOf("a", 1); //c = 2
        int c2 = str.indexOf("a", 3); //c = 5
        int c3 = str.indexOf("a", 6); //c = -1
        int d = str.lastIndexOf("a");//d = 5
        int e = str.lastIndexOf("a",3); //e = 2
        System.out.println(a);
        System.out.println(b);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(d);
        System.out.println(e);

        // 5、toUpperCase()； toLowerCase()；
        // 字符串大小写的转换
        String str7="hello world";
        System.out.println("将字符串转大写为：" + str7.toUpperCase());
        System.out.println("将字符串转换成小写为：" + str7.toUpperCase().toLowerCase());

        // 6、String[] split(“字符”)
        // 根据给定的正则表达式的匹配来拆分此字符串。形成一个新的String数组。
        String str8 = "boo:and:foo";
        String[] arr1 = str8.split(":");
        String[] arr2 = str8.split("o");

        // 7、boolean equals(Object anObject)
        // 语法 ：字符串变量名.equals(字符串变量名);　　
        // 返回值为布尔类型。所以这里用 if 演示。比较两个字符串是否相等，返回布尔值
        String str9 = "hello";
        String str10 = "world";
        if (str9.equals(str10)) {
            System.out.println("这俩字符串值相等");
        } else {
            System.out.println("这俩字符串值不相等");
        }

        // 8、trim();去掉字符串左右空格　　
        // replace(char oldChar,char newChar);
        // 新字符替换旧字符，也可以达到去空格的效果一种。
        String str11 = "      星期一        ";
        System.out.println("去掉左右空格后:" + str11.trim());
        String str12 = "       星期一         ";
        System.out.println("去掉左右空格后:" + str12.replace(" ",""));

        // 9、String substring(int beginIndex,int endIndex)　　
        // 截取字符串
        String sub1 = str5.substring(0, 5);
        System.out.println(sub1);
        String sub2 = str5.substring(3);
        System.out.println(sub2);

        // 10、boolean equalsIgnoreCase(String)
        // 忽略大小写的比较两个字符串的值是否一模一样，
        // 返回一个布尔值
        System.out.println(str.equalsIgnoreCase(str2));

        // 11、boolean contains(String)
        // 判断一个字符串里面是否包含指定的内容，
        // 返回一个布尔值
        System.out.println(str.contains("o"));

        // 12、boolean startsWith(String)　　
        // 测试此字符串是否以指定的前缀开始。
        // 返回一个布尔值
               String str13 = "HELLO WORLd";
                String str14 = "HE";
                if (str13.startsWith(str14)) {
                    System.out.println("str内容中存在HE前缀开头");
                } else {
                    System.out.println("抱歉没找着");
                }

        // 13.boolean endsWith(String)　　
        // 测试此字符串是否以指定的后缀结束。
        // 返回一个布尔值

        // 14、String replaceAll(String,String) 将某个内容全部替换成指定内容，　　
        // String repalceFirst(String,String) 将第一次出现的某个内容替换成指定的内容






    }
}
