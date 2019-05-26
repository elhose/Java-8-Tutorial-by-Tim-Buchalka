public class Main {

    public static void main(String[] args) {

        Window window = new Window("białe",2,1);

        Door door = new Door("czarne",2,"prawe");

        Bed bed = new Bed("duże","brązowe");

        Room asdasdasdas= new Room(window, door, bed);

        asdasdasdas.getBed().sleeping(34);

        asdasdasdas.ventilation();


    }
}
