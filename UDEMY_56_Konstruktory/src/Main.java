public class Main {



    public static void main(String[] args) {

        Bank millenium = new Bank();

        millenium.setAccountNumber("131xdxd31231");
        System.out.println(millenium.getAccountNumber());
        millenium.setBalance(123123);
        millenium.setEmail("chuj@gmail.com");
        millenium.setPhoneNumber("123456789");

        millenium.depositFunds(444444);


        millenium.withdrawFunds(666666);


    }
}
