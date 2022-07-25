package org.example.day6;

import java.util.Date;

public final class TransferOrder {
    //订单基本信息
    private String orderId;
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private boolean isSuccess;
    private Date time = new Date();

    public TransferOrder(String fromAccountId, String toAccountId, double amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString(){
        return "TransferOrder[orderId=" + orderId + ", fromAccountId=" + fromAccountId + ", time=" +
                time + ", isSuccess=" + isSuccess + ", amount=" + amount + ", toAccountId=" + toAccountId + "]";
    }


}
