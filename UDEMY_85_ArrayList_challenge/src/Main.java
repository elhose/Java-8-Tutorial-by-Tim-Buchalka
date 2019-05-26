import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {

        boolean quit = true;
        int option = 0;


        while (quit){
            opcje();
            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {

                case 1:
                    quit = false;
                    System.out.println("Phone shutting down");
                    break;

                case 2:
                    print();
                    break;

                case 3:
                    add();
                    break;

                case 4:
                   modify();
                    break;

                case 5:
                    remove();
                    break;

                case 6:
                    search();
                    break;
            }
        }
    }

    private static void opcje(){
        System.out.println("1 - wyjdź");
        System.out.println("2 - wyświetl kontakty");
        System.out.println("3 - dodaj kontakt");
        System.out.println("4 - modyfikuj kontakt");
        System.out.println("5 - usuń kontakt");
        System.out.println("6 - szukaj kontaktu");
    }

    private static void print(){
      mobilePhone.printContacts();
    }

    private static void add(){

        System.out.println("Podaj nazwe kontaktu do dodania");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj numer kontaktu do dodania");
        String numer = scanner.nextLine();
        Contact newContact = new Contact(nazwa,numer);
        mobilePhone.addContact(newContact);

    }

    private static void remove(){
        System.out.println("Podaj nazwe kontaktu do usunięcia");
        String nazwa = scanner.nextLine();
        mobilePhone.removeContact(nazwa);

    }

    private static void search(){
        System.out.println("Podaj nazwe kontaktu do wyszukania");
        String nazwa = scanner.nextLine();
        if (mobilePhone.findContact(nazwa) >=0){
            System.out.println("Kontakt o nazwie: " + nazwa + " już istnieje");
        }
        else System.out.println("Kontaktu: " + nazwa + " nie znaleziono");
    }

    private static void modify(){
        System.out.println("Podaj nazwe kontaktu do modyfikacji");
        String nazwa = scanner.nextLine();
        if (mobilePhone.findContact(nazwa) >=0) {
            System.out.println("Podaj nazwe nowego kontaktu");
            String nazwa2 = scanner.nextLine();
            System.out.println("Podaj numer nowego kontaktu");
            String numer2 = scanner.nextLine();
            Contact kontakt = new Contact(nazwa2, numer2);
            mobilePhone.modifyContact(mobilePhone.toClass(nazwa), kontakt);
        }

        else System.out.println("Nie ma takiego kontaktu!!!!!!!");
    }

}
