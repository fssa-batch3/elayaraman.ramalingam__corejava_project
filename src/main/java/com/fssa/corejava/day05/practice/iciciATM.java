package com.fssa.corejava.day05.practice;

public class iciciATM implements ATM{
    private static final int WITHDRAWAL_CHARGE = 10;
    @Override
    public boolean deposit(Account account, double amount) {
        if(amount > 0){
            account.setBalance(account.getBalance() + amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (amount > account.getBalance()) {
            throw new Exception("Insufficient funds");
        }
        if (account.getBalance() < 10000) {
            throw new Exception("Minimum funds are required");
        }
        account.setBalance(account.getBalance() - (amount + WITHDRAWAL_CHARGE));
        return true;
    }

    public double getBalance( ) {
        return account.getBalance();
    }
}
