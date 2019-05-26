import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Album {

    ArrayList<Songs> listOfSongs;


    public Album() {
        this.listOfSongs = new ArrayList<Songs>();
    }

    public boolean addSong(String nameOfASong, String durationOfASong){
        if(findSong(nameOfASong) != null){
            System.out.println("Dana piosenka już jest zapisana");
            return false;
        }
        else {
            Songs newSong = new Songs(nameOfASong,durationOfASong);
            this.listOfSongs.add(newSong);
            System.out.println("Udało się dodac piosenke");
            return true;
        }
    }

    public boolean removeSong(String nameOfASong){
        if(findSong(nameOfASong) == null){
            System.out.println("Danej piosenki nie ma na liście");
            return false;
        }
        else {
            this.listOfSongs.remove(findSong(nameOfASong));
            return true;
        }

    }

    private Songs findSong(String nameOfASong){

        for (Songs checkedSong: this.listOfSongs) {

            if (checkedSong.getName().equals(nameOfASong)){
                return checkedSong;
            }
        }
        return null;
    }
}
