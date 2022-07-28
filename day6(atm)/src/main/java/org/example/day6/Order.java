package org.example.day6;

import java.util.Date;
//abstract 代表是抽象类，不能new出一个新对象，不能实例化，只能实例化子类
public abstract class Order {
    // TODO 做成一个父类
    private String orderId;
    private boolean isSuccess;
    private final Date time = new Date();
    /**
     * protected abstract boolean getIsSuccess();
     * protected abstract String getOrderId();
     */
}
