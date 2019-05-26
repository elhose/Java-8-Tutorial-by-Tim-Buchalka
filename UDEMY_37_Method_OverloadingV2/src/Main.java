public class Main {

    public static void main(String [] args){

        getDurationString(450,23);

        getDurationString(27023);
    }

    public static String getDurationString(int minutes,int seconds){
        if((minutes<0)||(seconds<0 || seconds>59)) return "no chyba Cie pojebało kurwo szmato pierdolona w dupe jebana";

        int XX = minutes/60;
        int YY = minutes%60;
        int ZZ = seconds;

        String answer =(XX + " h " + YY + " m " + ZZ + " s");

        System.out.println(answer);

        return answer;

    }

    public static String getDurationString(int seconds){
        if(seconds<0) return "no chyba Cie pojebało kurwo szmato pierdolona w dupe jebana";

        return getDurationString(seconds/60,seconds%60);

    }

}
