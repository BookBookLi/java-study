package org.example.day6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    public String accountId;
    public String username;
    public String password;
    public double balance = 0;

    /** 记录开户时间 **/
    // private Date createTime;
    public Date createTime = new Date();

//    private CashOrder[] cashOrders = new CashOrder[1000];
//    private int cashOrderIndex = 0;
    private List<CashOrder> cashOrders = new ArrayList<>();

//    private TransferOrder[] transferOrders = new TransferOrder[1000];
//    private int transferOrderIndex = 0;
    private List<TransferOrder> transferOrders = new ArrayList<>();

    public void addCashOrder(CashOrder cashOrder){
//        cashOrders[cashOrderIndex] = cashOrder;
//        cashOrderIndex ++;
        cashOrders.add(cashOrder);
    }

    public void outCashOrder(){
        for (int i = 0;i < cashOrders.size();i++){
            System.out.println(cashOrders.get(i));
        }
    }

    public void addTransferOrder(TransferOrder transferOrder){
//        transferOrders[transferOrderIndex] = transferOrder;
//        transferOrderIndex ++;
        transferOrders.add(transferOrder);
    }

    public void outTransferOrder(){
        for (int i = 0;i < transferOrders.size();i++){
            System.out.println(transferOrders.get(i));
        }
    }

}
