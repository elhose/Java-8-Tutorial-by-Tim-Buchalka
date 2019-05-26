public class Main {

    public static void main(String[] args) {

        SportLeagueTable premierLeague = new SportLeagueTable("premierLeague");

        Team chelsea = new Team("chelsea",12);
        premierLeague.addTeam(chelsea,12);


        Team arsenal = new Team("arsenal",1);
        premierLeague.addTeam(arsenal,1);

        Team liverpool = new Team("liverpool",18);
        premierLeague.addTeam(liverpool,18);

        Team wislaPlock = new Team("chelsea",5);
        premierLeague.addTeam(wislaPlock,5);

        Team siekieraPila = new Team("chelsea",69);
        premierLeague.addTeam(siekieraPila,69);



        premierLeague.printTeams();


    }
}
