package homework.src.main.java.org.example.day2;

/**
 * 运算符
 */
public class Operator {
    public static void main(String[] args) {
        //运算符：+ - * / % ++ --
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println(result);

        //不同类型的除法
        int c = 4;
        int d = 3;
        System.out.println(c / d);//会直接取整
        //解决办法1：计算结果赋予类型
        double result2 = c*1.0 / d;
        System.out.println(result2);
        //解决办法2
        System.out.println(c*1.0 / d);
        //解决办法3：强制类型转换
        double result3 = (double)c / d;
        System.out.println(result3);
        //除法的注意事项：不能除0

        //mod
        int f = 12%7;
        System.out.println(f);

        //++,-- (对int才有)
        int g = 1;
        g++;
        System.out.println(g);
        //1.在内存中取g的原始值
        //2.在内存中取g+1的值
        //3.将g+1的值赋给新g
        ++g;
        //1.在内存中取g的原始值
        //2.将g+1的值赋给新g
        //3.在内存中取g+1的值
        System.out.println(g);
        //一般情况看下两者相同，特殊情况下不同

        int g1 = 1;
        System.out.println(1+ g1++);
        System.out.println(1+ ++g1);

        //布尔运算
        // 与运算（and）：&& 只有两个都为true时才为true
        // 或运算（or）：|| 只有两个都为false时才为false
        // 非运算（not）：！只有一个为true时才为false
           // ！true = false
           // ！false = true
        boolean b1 = true;
        System.out.println(b1);

        //关系运算 ==   ！=   >  <  >=   <=
        // == 等于
        // ！= 不等

        //强制类型转换
          //小变大
          //大变小，精度丢失
        double d1 = 1.10000000003;
        float f1 = (float) d1;
        int i1 = (int)d1;
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(i1);

        //位运算
        // & | ^ ~ << >>  >>>
        int a4 = 1; // 32位的int
        byte b4 = 1; //8位的byte
        // & 取二进制的最低位为1的位，如果最低为0，则为0，否则为1
        // | 取二进制的最低位为0的位，如果最低为1，则为1，否则为0
        // ^ 取二进制的最低位为0的位，如果最低为1，则为1，否则为0
        // ~ 取二进制的最低位为1的位，如果最低为0，则为1，否则为0
        // << 左移，将二进制的最低位为1的位向左移动制定的位数，如果最低为0，则为0，否则为1
        // >> 右移，将二进制的最低位为1的位向右移动制定的位数，如果最低为0，则为0，否则为1
        byte b5 = 4; // 0000 0010
        byte b6 = 3; // 0000 0011
        System.out.println(b5 & b6 ); // 0000 0010
        // 亦或 1^1=0 0^1=1 1^0=1 0^0=0
        System.out.println(b5 ^ b6 ); //0000 0001






    }
}
