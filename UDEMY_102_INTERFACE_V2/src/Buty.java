import java.util.ArrayList;
import java.util.List;

public class Buty implements ISaveable {

    private List<String> listaButow = new ArrayList();
    private String kolor;
    private int rozmiar;
    private String firma;

    public Buty() {

    }

    @Override
    public List getFiles() {
        return null;
    }

    @Override
    public void saveFiles(List lista) {

    }

    @Override
    public String toString() {

        String buty=null;

        for (int i=0;i<listaButow.size();i++){
            buty = buty + " , " +listaButow.get(i);
        }
        return buty;
    }
}
