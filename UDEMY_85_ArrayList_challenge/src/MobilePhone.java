import java.util.ArrayList;



public class MobilePhone {
    private  ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact (Contact kontakt){
        if (findContact(kontakt.getName()) >= 0){
            System.out.println("Kontakt już istnieje!!!!!!!!!");
            return false;
        }

        else{
            myContacts.add(kontakt);
            System.out.println("Pomyślnie dodano kontakt");
            return true;
        }

    }


    public int findContact(String contactName){
        for (int i=0;i<this.myContacts.size();i++){
            if (this.myContacts.get(i).getName().equals(contactName)){
                return 1;
            }
        }
        return -1;
    }


    public boolean removeContact(String kontakt){
        if (findContact(kontakt) < 0) {
            System.out.println("Nie ma takiego kontaktu, nie możesz go usunąć!!!!!!!!!!!!");
            return false;
        }

        else {

            this.myContacts.remove(findContact(kontakt));
            System.out.println("Kontakt usunięto pomyślnie");
            return true;
        }
    }

    public boolean modifyContact (Contact staryKontakt, Contact nowyKontakt){
        if (findContact(staryKontakt.getName()) <0) {
            System.out.println("nie ma takiego kontaktu, nie możesz go modyfikować!!!!!!!!!!!!!!!!");
            return false;
            }

        else{
            int position = this.myContacts.indexOf(staryKontakt);
            myContacts.set(position,nowyKontakt);
            return true;
        }
    }

    public void printContacts (){
        for(int i=0;i<this.myContacts.size();i++){

           String nazwa = this.myContacts.get(i).getName();
           String numer = this.myContacts.get(i).getNumber();

            System.out.println("na pozycji " + (i+1) + " kontakt o nazwie " + nazwa + " o numerze " + numer);
        }
    }


    public Contact toClass (String nazwa){
            return this.myContacts.get(findContact(nazwa));
    }
}


