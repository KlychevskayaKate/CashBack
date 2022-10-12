package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackTest {
    @Test
    public void test1 (){
        CashBackHackService service = new CashBackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void test2 (){
        CashBackHackService service = new CashBackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void test3 (){
        CashBackHackService service = new CashBackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void test4 (){
        CashBackHackService service = new CashBackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void test5 (){
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
}
