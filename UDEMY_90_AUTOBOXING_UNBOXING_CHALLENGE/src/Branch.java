import java.util.ArrayList;

public class Branch {

    ArrayList<Customer> customers ;
    private String name;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }


    public void addNewCustomer(String name, Double initialValue){

       if(findCustomer(name) != null){
           System.out.println("Dany klient istnieje już w oddziale");
       }
        else{
           this.customers.add(new Customer(name,initialValue));
       }
    }


    public void addFunds(String name, Double valueAdded){

        if(valueAdded <= 0){
            System.out.println("Możesz wpłacić tylko dodatnie sumy");
        }

        else {
            if (findCustomer(name) != null) {
                findCustomer(name).addFunds(valueAdded);
            }

            else {
                System.out.println("Nie ma takiego klienta");
            }
        }
    }


    private Customer findCustomer(String name){
        for(int i=0;i<customers.size();i++){

            if (this.customers.get(i).getName().equals(name)) {
                return this.customers.get(i);
            }

        }
        return null;
    }
}
