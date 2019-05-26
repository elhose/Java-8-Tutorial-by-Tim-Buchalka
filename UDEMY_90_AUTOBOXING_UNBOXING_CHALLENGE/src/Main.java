import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Bank bank = new Bank("Millenium");

        bank.addBranch("Podlaski");
        bank.addNewCustomer("Podlaski", "Jacek", 100.0);
        bank.addTransacrion("Podlaski", "Jacek", 20.0);
        bank.addNewCustomer("Podlaski", "Marcin", 150.0);

        bank.showCustomers("Podlaski");

        System.out.println(bank.branches.get(0).getCustomers());

        bank.addNewCustomer("Podlaski", "Jacek", 150.0);
    }


}
