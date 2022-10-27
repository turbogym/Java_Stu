package com.byonecup.OOP_IntermediateSection.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tim");
        account.setPwd("0000000");
        account.setBalance(50);
        System.out.println(account.toString());
    }
}
