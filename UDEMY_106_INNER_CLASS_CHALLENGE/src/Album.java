import java.util.ArrayList;


public class Album {

    private Songlist tracks;

    private class Songlist{
       private ArrayList<Songs> listOfSongs;

        public Songlist() {

            this.listOfSongs = new ArrayList<>();
        }


        private boolean add (Songs song){
            if (listOfSongs.contains(song)){
                return false;
            }
            else{
                listOfSongs.add(song);
                return true;
            }

        }


        private Songs findSong(String nameOfASong){

            for (Songs checkedSong: tracks.listOfSongs) {

                if (checkedSong.getName().equals(nameOfASong)){
                    return checkedSong;
                }
            }
            return null;
        }

    }

    public boolean addSong(String nameOfASong, String durationOfASong){
        this.tracks.add(new Songs(nameOfASong,durationOfASong));
    }



    public Album() {
        this.tracks = new Songlist();
    }



//    public boolean removeSong(String nameOfASong){
//        if(findSong(nameOfASong) == null){
//            System.out.println("Danej piosenki nie ma na liście");
//            return false;
//        }
//        else {
//            tracks.listOfSongs.remove(findSong(nameOfASong));
//            return true;
//        }
//
//    }





}
