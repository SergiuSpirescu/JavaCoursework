package com.sspirescu;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void doublewithdraw() {
        BankAccount account = new BankAccount("Sergiu", "Tommy", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance,0);

    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Sergiu", "Tommy", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Sergiu", "Tommy", 1000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_True() throws Exception {
        BankAccount account = new BankAccount("Sergiu", "Tommy", 1000.00, BankAccount.CHECKING);
        assertTrue("The account is NOT a Checking account", account.isChecking());
    }

//    @org.junit.Test
//    public void dummyTest() {
//        assertEquals(20, 21);
//    }


}