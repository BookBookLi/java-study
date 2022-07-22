package org.example.day4;


/**
 * java 方法
 */
public class Method {
    public static void main(String[] args) {
        //静态方法的调用:同一个类里面，直接调用;把public改成private，只能在这个类里面用；去掉public，只能在这个包里面用
        Method.compareStatic(1,1);
        compareStatic(1,1);

        int param1 = 1;
        int param2 = 2;
        int result = compareStatic(param1,param2);
        if (result == 1){
            System.out.println("param1大于param2");
        } else if (result == -1) {
            System.out.println("param1小于param2");
        } else {
            System.out.println("param1等于param2");
        }





        Method2.compareStatic2(1,1);
        //这是不同类里面的方法，要调用的解决方法：
        //1.在该类下创建这个方法
        //2.import该方法：import static org.example.day4.Method2.compareStatic2;
        //3.类名.方法名调用:Method2.compareStatic2(1,1);

        //实例方法的调用
        Method m = new Method();
        m.compareInstance(1,1);


    }

    //静态方法；int表示返回的类型，没有的话就写成void；命名：驼峰命名法；（）里是表示参数
    //比较两个数的大小
    public static int compareStatic(int a, int b){
        if (a > b){
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    //实例方法
    //比较两数组大小
    public int compareInstance(int a, int b){
        return 0;
    }




}
