import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liczby implements ISaveable {

    private int liczba1;
    private int liczba2;
    private String liczba3;
    private String liczba4;


    public Liczby(int liczba1, int liczba2, String liczba3, String liczba4) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
        this.liczba4 = liczba4;
    }

    @Override
    public void read(List<String> arrayList) {
        if (arrayList.isEmpty()==false){
            this.liczba1 = Integer.parseInt(arrayList.get(0));
            this.liczba2 = Integer.parseInt(arrayList.get(1));
            this.liczba3 = arrayList.get(2);
            this.liczba4 = arrayList.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,"" + this.liczba1);
        values.add(1,"" + this.liczba2);
        values.add(2,liczba3);
        values.add(3,liczba4);
        return values;
    }


    @Override
    public String toString() {
        return "Liczby{" +
                "liczba1=" + liczba1 +
                ", liczba2=" + liczba2 +
                ", liczba3='" + liczba3 + '\'' +
                ", liczba4='" + liczba4 + '\'' +
                '}';
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public String getLiczba3() {
        return liczba3;
    }

    public void setLiczba3(String liczba3) {
        this.liczba3 = liczba3;
    }

    public String getLiczba4() {
        return liczba4;
    }

    public void setLiczba4(String liczba4) {
        this.liczba4 = liczba4;
    }
}
