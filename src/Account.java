
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate; // percentage %

    Date dateCreated = new Date();

    public Account() {
        this(0,0,0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12.0;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate() / 100 * this.balance;
    }

    public void withdraw(double withdrawnAmount){
        if(this.balance - withdrawnAmount >= 0){
            this.balance -= withdrawnAmount;
        } else{
            System.out.println("Not enough money to withdraw");
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        } else{
            System.out.println("Please enter a valid amount");
        }
    }

}
