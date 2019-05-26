public class Bed {
    private String size;
    private String color;

    public Bed(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void sleeping(int hours){
        System.out.println("spałeś " + hours + " godzin");
    }



    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
