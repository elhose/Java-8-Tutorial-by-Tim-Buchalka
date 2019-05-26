public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public VIPCustomer() {
        this("defaultowe Imie",0,"1metoda@cipa.pl");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "2metoda@chuj.com");
    }

    public VIPCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
