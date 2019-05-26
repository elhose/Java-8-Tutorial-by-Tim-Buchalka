public class Door {
    private String color;
    private int numberOfWindows;
    private String direction;

    public Door(String color, int numberOfWindows, String direction) {
        this.color = color;
        this.numberOfWindows = numberOfWindows;
        this.direction = direction;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getDirection() {
        return direction;
    }
}
