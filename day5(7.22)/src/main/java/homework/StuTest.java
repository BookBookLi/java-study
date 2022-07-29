package homework;

public class StuTest {
    public static void main(String[] args) {
        // 空参构造方法创建对象
        Stu stu1 = new Stu();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.show();
        // 有参构造方法创建对象
        Stu stu2 = new Stu("李四",18);
        stu2.show();

    }
}
