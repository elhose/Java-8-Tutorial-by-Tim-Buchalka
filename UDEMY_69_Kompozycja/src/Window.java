public class Window {
    private String color;
    private int numberOfHandles;
    private int windowToWindowRatio;

    public Window(String color, int numberOfHandles, int windowToWindowRatio) {
        this.color = color;
        this.numberOfHandles = numberOfHandles;
        this.windowToWindowRatio = windowToWindowRatio;
    }




    public void ventilation (){
        System.out.println("wietrze pokój......");
    }

    private String getColor() {
        return color;
    }

    private int getNumberOfHandles() {
        return numberOfHandles;
    }

    private int getWindowToWindowRatio() {
        return windowToWindowRatio;
    }
}
