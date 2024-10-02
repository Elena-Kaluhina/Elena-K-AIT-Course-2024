package classwork17.bank_account.model;

//- Реализуем класс BankAccount:
//  - поля: account, owner, bank, branch, balance
//  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
//  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
//    полиморфизма)
//  - реализуем методы deposit() и withdraw() в классе BankAccount

public class BankAccount {

    //FIELDS - заполняем поля
    private long id;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    //Constructor
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //new Constructor without balance
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
    }

    //new Constructor without name (anonim)
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //печать данных
    public void display(){
        System.out.println("Account: " + id + ", owner: " + owner + ", bank name: " + bankName +
                ", branch: " + branch + ", balance: " + balance);
    }

    //toString
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balance=" + balance +
                '}';
    }

    public boolean deposit(double sum){//кладем деньги
        balance = balance + sum;
        return true;
    }

    public boolean withdraw(double sum){//снимаем деньги
        if(sum <= balance){
            balance = balance - sum;
        }
        return false;
    }
}
