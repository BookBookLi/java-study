package homework;

public class Phone {
    //1.手机类中定义品牌，价格，颜色
    public String brand;
    public int price;
    public String color;
    //2.定义打电话和发短信的方法
    public void call(){
        System.out.println("正在使用价格为:" + price + "元黑色的" + brand + "手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为:" + price + "元黑色的" + brand + "手机发短信");
    }
    //3.在测试类中调用方法

}
