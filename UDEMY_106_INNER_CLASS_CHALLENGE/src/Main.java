import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album = new Album();

        LinkedList<Songs> playlist = new LinkedList<Songs>();

        boolean exit = false;
        boolean forward = true;
        int option;



        album.addSong("a", "123");
        album.addSong("b", "234");
        album.addSong("c", "345");
        album.addSong("d", "456");
        album.addSong("e", "567");
        album.addSong("f", "678");
        album.addSong("g", "789");
        album.addSong("h", "890");



        Album album1 = new Album();
        album1.addSong("1", "123");
        album1.addSong("2", "234");
        album1.addSong("3", "345");
        album1.addSong("4", "456");
        album1.addSong("5", "567");
        album1.addSong("6", "678");
        album1.addSong("7", "789");
        album1.addSong("8", "890");



        playlist.add(album.listOfSongs.get(0));
        playlist.add(album.listOfSongs.get(1));
        playlist.add(album.listOfSongs.get(2));
        playlist.add(album.listOfSongs.get(3));
        playlist.add(album1.listOfSongs.get(0));
        playlist.add(album1.listOfSongs.get(1));
        playlist.add(album1.listOfSongs.get(2));


        ListIterator<Songs> litr = playlist.listIterator();


        if(playlist.size()==0){
            System.out.println("playlista pusta");
        }
        else{
            System.out.println("teraz leci: " + litr.next().getName());
        }

        while (!exit) {
            option = scanner.nextInt();
            scanner.nextLine();



            switch (option) {
                case 1:
                    printOptions();
                    break;

                case 2:
                    if(!forward) {
                        if (litr.hasNext()) {
                            litr.next();
                        }
                        forward = true;
                    }

                        if (litr.hasNext()) {

                            System.out.println("NASTEPNY teraz leci: " + litr.next().getName());
                        }
                        else{
                            System.out.println("koiec playlisty");
                            forward = false;
                        }

                    break;

                case 3:
                    if(forward) {
                        if (litr.hasPrevious()) {
                            litr.previous();
                        }
                        forward = false;
                    }

                        if (litr.hasPrevious()) {

                            System.out.println("POPRZEDNI teraz leci: " + litr.previous().getName());
                        }
                        else{
                            System.out.println("już osiagnales poczatek playlisty playlisty");
                            forward = true;
                        }

                    break;

                case 4:
                    if(forward){

                        if (litr.hasPrevious()) {
                            System.out.println("REPLAY teraz leci: " + litr.previous().getName());
                            forward = false;
                        }
                        else
                            System.out.println("jesteś na końcu playlisty");
                    }
                    else{
                        if (litr.hasNext()) {
                            System.out.println("REPLAY teraz leci: " + litr.next().getName());
                            forward = true;
                        }
                        else
                            System.out.println("jesteś na poczatku playlisty");
                    }
                    break;

                case 5:
                    if (playlist.size()>0)
                        litr.remove();
                    if (forward)
                        litr.next();
                    else
                        litr.previous();
                    break;


                case 6:
                    ListIterator<Songs> itr = playlist.listIterator();
                    while(itr.hasNext())
                        System.out.println(itr.next().getName());
                    break;

                case 7:
                    exit = true;
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("OBDZJE: \n" +
                "1 - wydrukuj instrukcje \n" +
                "2 - następna piosenka \n" +
                "3 - poprzednia piosenka \n" +
                "4 - JEsZCZE RAZZZ \n" +
                "5 - usuń piosenke \n" +
                "6 - wyświetl playliste \n" +
                "7 - wyjdź");

    }

}



