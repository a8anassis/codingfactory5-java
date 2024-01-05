package gr.aueb.cf.ch15.accounts.model;

import gr.aueb.cf.ch15.accounts.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.accounts.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.accounts.exceptions.SsnNotValidException;

public class JointAccount extends IdentifiableEntity {
    private Account account;
    private User secondHolder;

    public JointAccount() {

    }

    public JointAccount(Account account, User secondHolder) {
        this.account = account;
        this.secondHolder = secondHolder;
    }

    public Account getAccount() {
        return new Account(account);
    }

    public void setAccount(Account account) {
        this.account = new Account(account);
    }

    public User getSecondHolder() {
        return new User(secondHolder);
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = new User(secondHolder);
    }

    public void deposit(double amount) throws NegativeAmountException {
        account.deposit(amount);
    }

    public void withdraw(double amount, String ssn)
            throws InsufficientBalanceException, SsnNotValidException {
        if (secondHolder.getSsn().equals(ssn)) {
            account.setHolder(secondHolder);
        }
        if (account.getHolder().getSsn().equals(ssn)) {
            account.setHolder(account.getHolder());
        }
        account.withdraw(amount, ssn);
    }

    public double getBalance() {
        return account.getAccountBalance();
    }
}
