class BankAccount{
    int accountNumber;double balance;
    BankAccount(int a,double b){accountNumber=a;balance=b;}
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int a,double b,double i){super(a,b);interestRate=i;}
    void displayAccountType(){System.out.println("SavingsAccount");}
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(int a,double b,double w){super(a,b);withdrawalLimit=w;}
    void displayAccountType(){System.out.println("CheckingAccount");}
}
class FixedDepositAccount extends BankAccount{
    int term;
    FixedDepositAccount(int a,double b,int t){super(a,b);term=t;}
    void displayAccountType(){System.out.println("FixedDepositAccount");}
}
public class BankAccounts{
    public static void main(String[] args){
        new SavingsAccount(1,1000,5.0).displayAccountType();
        new CheckingAccount(2,2000,500).displayAccountType();
        new FixedDepositAccount(3,5000,12).displayAccountType();
    }
}