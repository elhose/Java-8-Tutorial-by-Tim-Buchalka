public class Room {

    private Window window;
    private Door door;
    private Bed bed;

    public Room(Window window, Door door, Bed bed) {
        this.window = window;
        this.door = door;
        this.bed = bed;
    }


    public void ventilation(){

        window.ventilation();

    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Bed getBed() {
        return bed;
    }
}
