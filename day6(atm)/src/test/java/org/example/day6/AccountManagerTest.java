package org.example.day6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void openAccount() {
        // TODO add test code here
        // 测试用例1
        Account account1 = AccountManager.openAccount("张三", "123456", "123456");
        assertNotNull(account1);
        assertNotNull(account1.accountId);

        // 测试用例2
        Account account2 = AccountManager.openAccount("张三", "123455", "123456");
        assertNull(account2);

        // 测试用例3
        Account account3 = AccountManager.openAccount("张三", "", "123456");
        assertNull(account3);

        // 测试用例4
        Account account4 = AccountManager.openAccount("", "123456", "123456");
        assertNull(account4);
    }

    @Test
    void loginAccountTest(){
        // TODO add test code here
        // 登陆前要先开户
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        assert account != null;
        assertTrue(AccountManager.loginAccount(account.accountId,"123456"));
        assertFalse(AccountManager.loginAccount(account.accountId, "1234561"));
        assertFalse(AccountManager.loginAccount(null, "1234561"));
        assertFalse(AccountManager.loginAccount("12", "1234561"));
        assertFalse(AccountManager.loginAccount("1232342422", "1234561"));
        assertFalse(AccountManager.loginAccount(account.accountId, null));

        // 清除脏数据 account.closeAccount();

    }

    @Test
    void logoutTest(){
        // 退出前先开户登录
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        AccountManager.loginAccount(account.accountId, account.password);
        // 测试
        assertNotNull(AccountManager.currentAccount);
        AccountManager.logout();
        assertNull(AccountManager.currentAccount);

    }


    @Test
    void withdrawTest(){
        // 取钱之前先开户且登录
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        AccountManager.loginAccount(account.accountId, account.password);
        //测试
        assertNotNull(AccountManager.currentAccount);
        double a = -100.0;
        double b = 0.0;
        double c = 100.0;
        double d = 10.0;
        assertEquals(AccountManager.withdraw( a ), -1);
        assertEquals(AccountManager.withdraw( b ), -1);
        assertEquals(AccountManager.withdraw( c ), -1);
        AccountManager.currentAccount.balance = 50.0;
        assertEquals(AccountManager.withdraw( a ), -1);
        assertEquals(AccountManager.withdraw( b ), -1);
        assertNotEquals(AccountManager.withdraw( c ), account.balance);
        assertEquals(AccountManager.withdraw( d ), account.balance);

    }

    @Test
    void depositTest(){
        // 存钱之前先开户且登录
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        AccountManager.loginAccount(account.accountId, account.password);
        //测试
        assertNotNull(AccountManager.currentAccount);
        double a = -100.0;
        double b = 0.0;
        double c = 100.0;
        assertEquals(AccountManager.deposit( a ), -1);
        assertEquals(AccountManager.deposit( b ), -1);
        assertNotEquals(AccountManager.deposit( c ), -1);
        assertEquals(AccountManager.deposit( c ), account.balance);

    }

    @Test
    void getBalanceTest(){
        // 查询余额之前先开户且登录
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        AccountManager.loginAccount(account.accountId, account.password);
        //测试
        assertNotNull(AccountManager.currentAccount);
    }

    @Test
    void transferTest(){
        // 转账之前先开户且登录
        Account account1 = AccountManager.openAccount("张三", "123456", "123456");
        Account account2 = AccountManager.openAccount("张二", "123456", "123456");
        AccountManager.loginAccount(account1.accountId, account1.password);
        //测试
        assertNotNull(AccountManager.currentAccount);
        double a = -100.0;
        double b = 0.0;
        double c = 100.0;
        double d = 10.0;
        assertFalse(AccountManager.transfer(account2.accountId, account2.username, a ));
        assertFalse(AccountManager.transfer(account2.accountId, account2.username, b ));
        assertFalse(AccountManager.transfer(account2.accountId, account2.username, c ));
        AccountManager.currentAccount.balance = 50.0;
        assertFalse(AccountManager.transfer(account2.accountId, account2.username, c ));
        assertTrue(AccountManager.transfer(account2.accountId, account2.username, d ));

    }

}