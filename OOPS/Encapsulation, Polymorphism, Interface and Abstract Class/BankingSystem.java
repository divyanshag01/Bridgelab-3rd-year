import java.util.*;
abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;
    BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public String getAccountNumber(){return accountNumber;}
    public String getHolderName(){return holderName;}
    public double getBalance(){return balance;}
    public void setBalance(double b){this.balance=b;}
    public void deposit(double amount){if(amount>0)balance+=amount;}
    public boolean withdraw(double amount){if(amount>0 && balance>=amount){balance-=amount;return true;}return false;}
    public abstract double calculateInterest();
}
interface Loanable{
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(String acc,String name,double bal){super(acc,name,bal);}
    public double calculateInterest(){return getBalance()*0.04;}
    public boolean applyForLoan(double amount){return amount<=getBalance()*5;}
    public double calculateLoanEligibility(){return getBalance()*5;}
}
class CurrentAccount extends BankAccount implements Loanable{
    CurrentAccount(String acc,String name,double bal){super(acc,name,bal);}
    public double calculateInterest(){return 0;}
    public boolean applyForLoan(double amount){return amount<=getBalance()*2;}
    public double calculateLoanEligibility(){return getBalance()*2;}
}
public class BankingSystem{
    public static void main(String[] args){
        List<BankAccount> accounts=new ArrayList<>();
        accounts.add(new SavingsAccount("S001","Charlie",50000));
        accounts.add(new CurrentAccount("C001","Delta",200000));
        for(BankAccount a:accounts){
            System.out.println(a.getHolderName()+" Balance: "+a.getBalance()+" Interest: "+a.calculateInterest());
            if(a instanceof Loanable){
                Loanable l=(Loanable)a;
                System.out.println("Loan Eligibility: "+l.calculateLoanEligibility());
            }
        }
    }
}