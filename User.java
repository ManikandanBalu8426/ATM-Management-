package ATM_Management;

public class User {
    private String name;
    private long accountNumber;
    private int PIN;
    private long balance;

    public User(){

    }

    public User(String name, long accountNumber, int PIN, long balance ){
        this.name = name;
        this.accountNumber = accountNumber;
        this.PIN = PIN;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getPIN(){
        return PIN;
    }
}
