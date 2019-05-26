public class Main {

    public static void main (String [] args){


        System.out.println(sumOdd(1,11));
       /* int suma=0;
        int numberOfFigures=0;

        for(int i=1;i<=1000;i++){


            if(i%3==0 && i%5==0){
                numberOfFigures++;
                suma += i;
                System.out.println(i);
            }

            if(numberOfFigures==5){
                System.out.println(suma);
                break;
            }
        }*/
    }

    public static boolean isOdd(int number){
        if(number<0) return false;

        else if(number%2==1) return true;
        else return false;
    }

    public static int sumOdd(int start, int end){

        if(start<0 || end<0 || end<start) return -1;

        int sum=0;

        for(int i=start;i<=end;i++){

            if(isOdd(i)) {
                sum += i;
            }

        }

        return sum;
    }


}
