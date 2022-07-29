package org.example.day5;

public class Student extends People implements Action{ //extends 继承
    //规定类的一些属性
    public static String school = "SCU"; //静态变量
    public final static String SCHOOL = "SCU"; // 常量
    public String name;
    public int age;
    String theClass;
    private long stuId;
    public ClassEnum classEnum;
    // 无参构造函数
    public Student() {

    }

    //有参构造函数
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员方法&变量
    public void setName(String name){
        this.name = name;
    }
    //stu2.setName这样使用
    //成员方法可以互相访问，成员方法可以调用静态方法

    @Override
    public void goClassRoomWay() {
        System.out.println("Student goClassRoomWay" );
    }

    @Override
    public void method1() {
        System.out.println("method1" );

    }

    @Override
    public void method2() {
        System.out.println("method2" );
    }

}
