import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class BANKAccount {

    private String accountNumber;
    private double balance;
    private Lock lock;

    public BANKAccount(double balance, String accountNumber, ReentrantLock lock) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = lock;
    }

    public void withdraw(double amount) {

        boolean status = false;
        try {
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                try{
                    balance -= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Couldn't get the lock");
                status = false;
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Transaction status = " + status);
    }

    public  void deposit(double amount) {

        boolean status = false;

        try {
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Couldn't get the lock");
                status = false;
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void printAccountNumber(){
        System.out.println(this.accountNumber);
    }
}
