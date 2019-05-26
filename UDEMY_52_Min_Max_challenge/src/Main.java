import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner chuj = new Scanner(System.in);
        int min=2147483647;
        int max=-2147483647;

        while(true){
            System.out.println("Podaj numer: ");


            if(chuj.hasNextInt()){

                int number = chuj.nextInt();

                if(min>number) min=number;

                if(max<number) max=number;


            }

            else break;
            chuj.nextLine();
        }

        System.out.println("min:  " + min);
        System.out.println("max:  " + max);

        chuj.close();
    }
}
