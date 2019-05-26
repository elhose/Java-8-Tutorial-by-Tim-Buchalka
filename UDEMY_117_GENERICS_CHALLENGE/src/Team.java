public class Team {
    private String nameOfTeam;
    private int pointsScored;

    public Team(String nameOfTeam, int pointsScored) {
        this.nameOfTeam = nameOfTeam;
        this.pointsScored = pointsScored;
    }



    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public String komunikat(){
        return nameOfTeam +" z ilością punktów równą: " + pointsScored;
    }
}
