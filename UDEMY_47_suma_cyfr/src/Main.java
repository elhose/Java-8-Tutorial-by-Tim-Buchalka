public class Main {
    public static void main (String [] args){

        System.out.println(sumDigits(4));


    }

     public static int  sumDigits(int number){

        if(number<10) return -1;

        int sum=0;

        for(int i=0;number>0;i++){

            sum += number%10;
            number = number/10;


        }

        return sum;

    }


}
