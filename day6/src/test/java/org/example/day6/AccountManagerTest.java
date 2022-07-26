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
        assertTrue(AccountManager.loginAccount(account.accountId,"123456"));
        assertFalse(AccountManager.loginAccount(account.accountId, "1234561"));
        assertFalse(AccountManager.loginAccount(null, "1234561"));
        assertFalse(AccountManager.loginAccount("12", "1234561"));
        assertFalse(AccountManager.loginAccount("1232342422", "1234561"));
        assertFalse(AccountManager.loginAccount(account.accountId, null));

        // 清除脏数据 account.closeAccount();

    }
/**
    @Test
    void logoutTest(){
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        if (AccountManager.loginAccount(account.accountId, account.password)){
            Account currentAccount = account;
            AccountManager.logout();
            assertNull(currentAccount.accountId);
        }
    }
 **/

    @Test
    void withdrawTst(){

    }

}