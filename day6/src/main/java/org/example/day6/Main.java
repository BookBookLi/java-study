package org.example.day6;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //title
        printWelcome();
        printMainMenu();
    }

//欢迎方法
    public static void printWelcome(){
        System.out.println("=== Welcome to the BookBook's ATM System ===");
    }
//主菜单
    public static void printMainMenu(){
        System.out.println("=== 主菜单 ===");
        System.out.println("请输入数字1/2/3，从以下选项中选择您所需进行的操作");
        System.out.println("1.开设账户");
        System.out.println("2.登录账户");
        System.out.println("3.退出");
        System.out.println("请输入：");
        Scanner in = new Scanner(System.in);

        //主菜单选择
        int choice = in.nextInt();
        /*
        用户可能输入非整数
        try {
            int choice = in.nextInt();
        }catch (InputMismatchException e){

        }
         */
        switch (choice){
            //1.开设账户
            case 1:
                System.out.println("=== 开设账户 ===");
                System.out.println("请输入 用户名：");
                String userName = in.next();
                System.out.println("请输入 密码：");
                String password = in.next();
                System.out.println("请输入 确认密码：");
                String checkPassword = in.next();
                Account result = AccountManager.openAccount(userName, password, checkPassword);
                if (result != null){
                    System.out.println("开户成功！！！");
                    //打印账户信息
                    System.out.println("您的账号为：" + result.accountId);
                //选择登录或者退出    printChoice1();
                }else{
                    System.out.println("开户失败！！！");
                }
                printMainMenu();
                break;

            //2.登陆账户
            case 2:
                System.out.println("=== 登录账户 ===");
                System.out.println("请输入 账号：");
                String accountId = in.next();
                System.out.println("请输入 密码：");
                String pwd = in.next();
                boolean isLogin = AccountManager.loginAccount(accountId, pwd);
                if (isLogin){
                    System.out.println("登陆成功！！！");
                    //打印用户菜单
                    printUserMenu();
                }else{
                    System.out.println("登陆失败！！！");
                    //重回主菜单
                    printMainMenu();
                }
                break;
            //3.退出
            case 3:
                System.out.println("=== 退出 ===");
                break;
            default:
                System.out.println("输入错误！！！");
                System.out.println("请重试");
                printMainMenu();
                break;

        }

    }


//用户菜单
    private static void printUserMenu() {
        System.out.println("=== 用户菜单 ===");
        System.out.println("请输入数字1/2/3/4/5/6，从以下选项中选择您所需进行的操作");
        System.out.println("1.取款");
        System.out.println("2.存款");
        System.out.println("3.转账");
        System.out.println("4.查询余额");
        System.out.println("5.查询交易记录");
        System.out.println("6.退出");
        System.out.println("请输入：");

        //用户菜单选择
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            //1.取款
            case 1:
                System.out.println("=== 取款 ===");
                System.out.println("请输入 取款金额: ");
                double amount = in.nextDouble();
                double balance = AccountManager.withdraw(amount);
                //选择是否返回
                printUserMenu();
                break;
            //2.存钱
            case 2:
                System.out.println("=== 存钱 ===");
                System.out.println("请输入 存钱金额: ");
                amount = in.nextDouble();
                balance = AccountManager.deposit(amount);
                //选择是否返回
                printUserMenu();
                break;
            //3.转账
            case 3:
                System.out.println("=== 转账 ===");
                System.out.println("请输入 转账账号: ");
                String toAccountId = in.next();
                System.out.println("请输入 转账用户名: ");
                String toUserName = in.next();
                System.out.println("请输入 转账金额: ");
                amount = in.nextDouble();
                boolean result = AccountManager.transfer(toAccountId, toUserName, amount);
                if (result){
                    System.out.println("转账成功!!!");
                }else{
                    System.out.println("转账失败!!!");
                }
                printUserMenu();
                break;
            //4.查询余额
            case 4:
                System.out.println("=== 查询余额 ===");
                balance = AccountManager.getBalance();
                System.out.println("当前账户余额为: " + balance);
                printUserMenu();
                break;
            //5.查询交易记录
            case 5:
                printRecordsMenu();
                break;
            //6.退出
            case 6:
                AccountManager.logout();
                System.out.println("=== 退出 ===");
                printMainMenu();
                break;
            //输入错误
            default:
                System.out.println("输入错误!!!");
                System.out.println("请重试");
                printUserMenu();
                break;
        }
    }

//交易记录查询菜单
    private static void printRecordsMenu() {
        System.out.println("=== 交易记录查询菜单 ===");
        System.out.println("请输入数字1/2/3，从以下选项中选择您所需进行的操作");
        System.out.println("1.查询存取款记录");
        System.out.println("2.查询转账记录");
        System.out.println("3.退出");
        System.out.println("请输入：");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            //1.查询存取款记录
            case 1:
                AccountManager.currentAccount.outCashOrder();
                printRecordsMenu();
                break;
            //2.查看转账记录
            case 2:
                AccountManager.currentAccount.outTransferOrder();
                printRecordsMenu();
                break;
            case 3:
                printUserMenu();
                break;
            default:
                System.out.println("输入错误!!!");
                System.out.println("请重试");
                printUserMenu();
                break;
        }
    }

/**选择下一步操作
 public static void printChoice1;){
 System.out.println("===  请选择要进行的操作为：  ===");
 System.out.println("1.返回主菜单");
 System.out.println("2.登陆账户");
 }
 **/



}
