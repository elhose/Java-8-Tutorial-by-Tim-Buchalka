import java.util.ArrayList;

public class Bank {


    ArrayList<Branch> branches;
    private String name;

    public Bank( String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public void addBranch (String name){

        if(findBranch(name) != null){
            System.out.println("Dany oddział już istnieje");
        }

        this.branches.add(new Branch(name));
    }

    public void addNewCustomer(String branchName, String name, Double initialValue){
        if (findBranch(branchName) != null){
            findBranch(branchName).addNewCustomer(name,initialValue);
        }
        else System.out.println("Nie ma takiego oddziału");
    }

    public void addTransacrion(String branchName, String name, Double value){
        if (findBranch(branchName) != null){
            findBranch(branchName).addFunds(name,value);
        }
        else System.out.println("Nie ma takiego oddziału");
    }

    public void showCustomers(String branchName){
        if (findBranch(branchName) != null){
            for(int i=0;i<findBranch(branchName).customers.size();i++){
                System.out.println(findBranch(branchName).customers.get(i).getName());
                System.out.println(findBranch(branchName).customers.get(i).getTransaction());
            }
        }
        else System.out.println("Nie ma takiego oddziału");
    }

    private Branch findBranch(String name){
        for(int i=0;i<branches.size();i++){
            if(this.branches.get(i).getName().equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }
}
