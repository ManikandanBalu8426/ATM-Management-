package ATM_Management;

public  class ATM_Implementation implements ATM_Operations{
    User user;
    public ATM_Implementation(User user){
        this.user = user;
    }
    long newBalance;

    @Override
    public void viewBalance() {
        newBalance = user.getBalance();
        System.out.println("Your current balance is " + newBalance);
    }

    @Override
    public void withdraw(long amount) {
        if(amount >=100 && amount <= user.getBalance()){
           newBalance = user.getBalance() - amount;
           user.setBalance(newBalance);
            System.out.println("cash successfully withdrawn");
        }
        else
            System.out.println("Can't withdraw money, Enter a valid amount");
    }

    @Override
    public void deposit(long amount) {
        if (amount >100){
           newBalance = user.getBalance() + amount;
           user.setBalance(newBalance);
            System.out.println("Your money is successfully deposited ");
        }
        else
            System.out.println("Can't withdraw money, Enter a valid amount");
    }
}

