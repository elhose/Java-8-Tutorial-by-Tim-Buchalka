public class Main {

    public static void main(String [] args){

       printTearsAndDates(561600);

    }

    public static void printTearsAndDates (long minutes){
        if(minutes<0) System.out.println("Invalid Value");

        long XX = minutes;


        long YY = minutes/(365*24*60);

        long ZZ = minutes%(365*24*60)/(60*24);

        System.out.println(XX+" min = "  + YY + " y and " + ZZ + " d" );

    }
}
