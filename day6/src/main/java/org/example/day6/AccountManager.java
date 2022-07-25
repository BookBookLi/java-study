package org.example.day6;

import java.util.Date;
import java.util.Random;

public class AccountManager {
    //存储账号信息
    public static final Account[] accounts = new Account[100];
    public static int currentAccountIndex = 0;
    public static Account currentAccount = null;

    /**private static int accountCount = 0;
    private static Account currentAccount;**/




/** 开户 **/
    public static Account openAccount(String username, String password, String checkPassword){
        if (!password.equals(checkPassword)){
            System.out.println("两次输入的密码不一致");
            return null;
        }
        Account account = new Account();
        account.username = username;
        account.password = password;
     /* 开户时间赋予当前时间，但在Account类里面已经有了
        account.createTime = new Date();
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());*/
        //随机生成accountId
        account.accountId = getRandomAccountId();
        //存储账号信息
        accounts[currentAccountIndex] = account;
        currentAccountIndex ++;
        return account;
    }
    //随机获取账户id
    /**
     * 随机生成6位数字的账号
     * @return
     */
    private static String getRandomAccountId(){
        Random random = new Random();
        String accountId = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< 6; i++){
            int num = random.nextInt(10);
            sb.append(num);
            // accountId += num;每次获得的随机数加在后面生成
        }
        return sb.toString();
    }
    /** Random 的使用
     * Random random2 = new Random(10);
     * 10是边界
     * System.out.println(random2.nextInt());
     *
     * Random random1 = new Random(10);
     * for (int i = 0; i < 100; i++){
     *    System.out.println(random1.nextInt());
     * }
     *
     */



//登录账户
    public static boolean loginAccount(String accountId, String password){
        //TODO 登陆逻辑
        for (int i = 0; i < currentAccountIndex; i++) {
            Account account = accounts[i];
            if (account == null) {
                continue;
            }
            if (account.accountId.equals(accountId) && account.password.equals(password)) {
                currentAccount = account; //记录当前登录用户信息
                return true;
            }
        }
        return false;
    }
//退出账户
    public static void logout(){
        currentAccount = null;
    }

//登录之后才能调用
    //取款
    public static double withdraw(double amount){
        //判断是否登陆
        if (currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        //取款金额必须大于0
        if (amount <= 0){
            System.out.println("取款金额必须大于0");
            return -1;
        }
        //判断余额是否比取款金额大
        if (amount > currentAccount.balance){
            System.out.println("余额不足");
            return -1;
        }
        currentAccount.balance -= amount;
        CashOrder cashOrder = new CashOrder(currentAccount.accountId, CashEnum.WITHDRAW, amount, true);
        currentAccount.addCashOrder(cashOrder);
        double balance = currentAccount.balance;
        System.out.println("取现成功 " + amount + "元");
        System.out.println("当前账户余额为: " + balance + "元");
        return balance;
    }


    //存钱
    public static double deposit(double amount){
        //TODO 存钱逻辑
        if (currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        //存入金额必须大于0
        if (amount <= 0) {
            System.out.println("存入金额必须大于0");
            return -1;
        }
        currentAccount.balance += amount;
        CashOrder cashOrder = new CashOrder(currentAccount.accountId, CashEnum.DEPOSIT, amount, true);
        currentAccount.addCashOrder(cashOrder);
        double balance = currentAccount.balance;
        System.out.println("存入成功 " + amount + "元");
        System.out.println("当前账户余额为: " + balance  + "元");
        return balance;
    }


    //查询余额
    public static double getBalance(){
        //TODO 获取余额逻辑
        if (currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        return currentAccount.balance;
    }

    //转账
    public static boolean transfer(String toAccountId, String toUsername, double amount){
        //TODO 转账逻辑
        if (currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return false;
        }
        Account toAccount = getAccountByIdAndUsername(toAccountId, toUsername);
        if (toAccountId == null){
            System.out.println("该账户不存在");
            return false;
        }
        //不能向自己转账
        //转账金额大于0
        if (amount <= 0){
            System.out.println("转账金额必须大于0");
            return false;
        }
        //账户余额不足
        if (amount > currentAccount.balance){
            System.out.println("余额不足");
            return false;
        }
        currentAccount.balance -= amount;
        TransferOrder transferOrder = new TransferOrder(currentAccount.accountId, toAccountId, amount);
        currentAccount.addTransferOrder(transferOrder);
        toAccount.balance += amount;
        return true;
    }

    private static Account getAccountByIdAndUsername(String accountId, String username){
        for (int i = 0; i < currentAccountIndex; i++){
            Account account = accounts[i];
            if (account == null){
                continue;
            }
            if (account.accountId.equals(accountId) && account.username.equals(username)){
                return account;
            }
        }
        return null;
    }



}
