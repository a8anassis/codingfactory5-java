package gr.aueb.cf.ch15.accounts.model;

import gr.aueb.cf.ch15.accounts.exceptions.SsnNotValidException;

public class OverdraftJointAccount extends OverdraftAccount {
    private User secondHolder;

    public OverdraftJointAccount() {

    }

    public OverdraftJointAccount(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    public OverdraftJointAccount(String iban, User holder, double balance, User secondHolder) {
        super(iban, holder, balance);
        this.secondHolder = secondHolder;
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        if (secondHolder.getSsn().equals(ssn)) {
            setHolder(secondHolder);
        }
        super.withdraw(amount,ssn);
    }
}
