public class Bank {

private String accountNumber;
private int balance;
private String email;
private String phoneNumber;


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

            public int depositFunds(int funds){
                if (funds <=0) {
                    System.out.println("You can only deposit positive amount of MONEY");
                    return -1;
                }
                else{
                    this.balance += funds;
                    System.out.println("Your current balance: " + this.balance);
                    return this.balance;
                }
            }


            public int withdrawFunds (int funds){
                if (funds<=0 || funds>this.balance){
                    System.out.println("You can only withdraw positive amount of MONEY and if you can afford it");
                    return -1;
                }
                else{
                    this.balance -= funds;
                    System.out.println("Your current balance: " + this.balance);
                    return this.balance
                }

            }
}
