package homework;

public class Stu {
    //1.定义两个成员变量
    public String stuname;
    public int stuage;
    //2.创建方法
    //无参数
    public Stu() {
    }
    public String getName() {
        return stuname;
    }
    public void setName(String stuname) {
        this.stuname = stuname;
    }
    public int getAge() {
        return stuage;
    }
    public void setAge(int stuage) {
        this.stuage = stuage;
    }
    //有参数
    public Stu(String stuname, int stuage) {
        this.stuname = stuname;
        this.stuage = stuage;
    }
    public void show(){
        System.out.println("学生姓名为：" + this.stuname + " 年龄为：" + this.stuage);
    }
    //3.编写测试类运行

}
