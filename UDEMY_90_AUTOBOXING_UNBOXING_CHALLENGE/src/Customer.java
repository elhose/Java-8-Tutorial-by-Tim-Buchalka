import java.util.ArrayList;

public class Customer {

    private String name;
    ArrayList<Double> transaction;


    public Customer(String name,Double initialValue) {

        this.name = name;
        this.transaction = new ArrayList<Double>();
        this.transaction.add(initialValue);
    }

    public void addFunds(Double value){
        this.transaction.add(value);
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }
}
