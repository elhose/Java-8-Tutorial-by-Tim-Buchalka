public class Main {

    public static void main (String [] args){

      //  calcFeetAndInchesToCentimeters(6,4);

        calcFeetAndInchesToCentimeters(76);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0)||(inches>12 || inches<0))
            return -1;

        double centimeters = (feet*12+inches)*2.54;

            System.out.println("feet " + feet + " inches " + inches + " = " + centimeters + " cm");
            return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches<0)
            return -1;

        int feet = (int)inches/12;
        int remaining_inches = (int)inches%12;

            return calcFeetAndInchesToCentimeters(feet,remaining_inches);
    }

}
