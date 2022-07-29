package homework;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "iphone";
        phone.price = 6999;
        phone.color = "white";
        phone.call();
        phone.sendMessage();
    }
}
