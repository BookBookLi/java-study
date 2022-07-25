package org.example.day6;

import java.util.Date;
import java.util.Random;

public class CashOrder {
    //订单基本信息
    private String orderId;
    private String accountId;
    private double amount;
    private boolean isSuccess;
    private Date time ;
    //取款或者存款
    private CashEnum type;

    public CashOrder(String orderId, CashEnum type, double amount, boolean isSuccess){
        this.orderId = orderId;
        this.orderId = getRandomOrderId();
        this.amount = amount;
        this.type = type;
        this.time = new Date();
        this.isSuccess = isSuccess;
    }


    private String getRandomOrderId(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< 6; i++){
            int num = random.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public Date getTime() {
        return time;
    }

    public CashEnum getType() {
        return type;
    }

    @Override
    public String toString(){
        return "CashOrder[orderId=" + orderId + ", accountId=" + accountId + ", time=" + time + ", isSuccess=" +
        isSuccess + ", amount=" + amount + ", type=" + type + "]";
    }


}
