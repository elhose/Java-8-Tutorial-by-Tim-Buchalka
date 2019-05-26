import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count;
        System.out.println("Podal ilość liczb: ");
        count = scanner.nextInt();
        scanner.nextLine();


        findMin(readIntegers(count));

    }

    private static int[] readIntegers (int count){
        int[] returnedArray = new int[count];

        System.out.println("Podaj liczby:");

        for(int i=0;i<count;i++){
            returnedArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return returnedArray;
    }

    private static int findMin(int [] array){

        int min = 2147483647;

        for (int i=0;i<array.length;i++){
            if(min > array[i]) min = array[i];
        }

        System.out.println(min);
        return min;
    }
}
