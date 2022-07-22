package homework.src.main.java.org.example.day2;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    //QO4
        System.out.println("Hello World!");
        int studentNumber = 100;
        System.out.println(studentNumber);
        double price = 55.55;
        System.out.println(price);
        long year = 4600000000L;
        System.out.println(year);
        boolean a = false; // a="5是偶数"
        System.out.println(a);
    //Q05
        //1.定义圆周率
        double b = 3.14; // b为圆周率
        //2.创建输入对象
        Scanner sc = new Scanner(System.in);
        //3.输入半径
        System.out.println("请输入圆柱体的半径（单位m）：");
        double r = sc.nextDouble(); // r 为半径
        //4.输入高
        System.out.println("请输入圆柱体的高（单位m）：");
        double h = sc.nextDouble(); // h 为高
        //5.计算圆柱体的体积
        double v = b * r *r * h;
        System.out.println("圆柱体的体积为：" + v + "m^2");
    //Q06
        //1.获取父母的身高
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入父亲的身高（单位：cm）：");
        double h1 = sc1.nextDouble();// h1为父亲的身高
        System.out.println("请输入母亲的身高（单位：cm）：");
        double h2 = sc1.nextDouble();// h2为母亲的身高
        //2.预测子女的身高
        double son = (h1 + h2) * 1.08 / 2;
        double daughter = (h1 * 0.923 + h2) /2;
        System.out.println("儿子的身高为（单位：cm）：" + son);
        System.out.println("女儿的身高为（单位：cm）：" + daughter);

    }
}
