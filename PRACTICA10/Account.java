
public class Account {

    private int balance = 0;

    public int getCurrentBalance() {

        return this.balance;
    }

    public void setCurrentBalance(int amount) {

        this.balance = amount;
    }

    public void deposit(int amount) {

        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
}