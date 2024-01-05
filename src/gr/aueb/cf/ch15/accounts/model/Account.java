package gr.aueb.cf.ch15.accounts.model;


import gr.aueb.cf.ch15.accounts.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.accounts.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.accounts.exceptions.SsnNotValidException;

public class Account extends IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account() {

    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(Account account) {
        iban = account.getIban();
        holder = account.getHolder();
        balance = account.getBalance();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    /*
     * Public API
     */

    /**
     *
     * @param amount
     * @throws NegativeAmountException
     *              if the amount to be deposited is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount exception");
            throw e;
        }
    }

    public void withdraw(double amount, String ssn)
            throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
        } catch (InsufficientBalanceException | SsnNotValidException e) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }

    public double getAccountBalance() {
        return balance;
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || getHolder().getSsn() == null) return false;

        return getHolder().getSsn().equals(ssn);
    }
}
