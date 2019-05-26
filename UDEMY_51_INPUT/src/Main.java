import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int quantinityOfDigits=1;
        int sum=0;
        int number;

        while(quantinityOfDigits<=10){

            System.out.println("Enter number #"+ quantinityOfDigits + ":");
            boolean isNextInt = scanner.hasNextInt();



            if(isNextInt){
                number=scanner.nextInt();
                sum += number;
                quantinityOfDigits++;
            }

            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        System.out.println(sum);

        scanner.close();
    }
}
