import java.util.LinkedList;
import java.util.ListIterator;

public class SportLeagueTable<T extends Team> {

    private String nameOfTheSport;

    private LinkedList<T> teams;

    public String getNameOfTheSport() {
        return nameOfTheSport;
    }

    public SportLeagueTable(String nameOfTheSport) {
        this.nameOfTheSport = nameOfTheSport;
        this.teams = new LinkedList<>();
    }



    public boolean addTeam(T team,int score){

        ListIterator<T> itr = teams.listIterator();


        if (teams.contains(team)){
            System.out.println("taki zespół już istnieje");
            return false;
        }
        else{
         if (teams.isEmpty() ){
             itr.add(team);
             System.out.println("udało się dodać drużyne(pierwsza drużyna dodana do tabeli)");
             return true;
         }
            boolean exit = false;
          while(itr.hasNext() && exit == false) {


             if(score > itr.next().getPointsScored()){
                 itr.previous();
                 itr.add(team);
                 System.out.println("przypadek 1");
                 exit = true;
             }

              if(itr.hasNext()== false){

                 itr.add(team);
                 System.out.println("przypadek 3");
                 exit = true;
             }

         }
            return true;
        }
    }

    public void  printTeams(){
        int i = 1;
        ListIterator<T> itr = teams.listIterator();
       while (itr.hasNext())
        {
            System.out.println("W tabeli " + getNameOfTheSport() + " zespół numer " + i++ + " to " + itr.next().komunikat() );
        }

    }

}
