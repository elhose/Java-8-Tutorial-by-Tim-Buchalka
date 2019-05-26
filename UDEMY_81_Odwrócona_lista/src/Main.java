import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("podaj rozmiar tablicy");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] array = insertNumbers(size);


        printArray(array);

       reverse(array);
        System.out.println();
        System.out.println();

      printArray(array);


    }

    private static void reverse(int [] array){
        int temp;

            for(int i=0; i<array.length/2; i++){
                temp = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-i-1] = temp;
            }
    }

    private static int[] insertNumbers(int count){

        int[] array = new int [count];
        System.out.println("wprowadź liczby");
        for (int i=0; i<count; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static void printArray(int[] array){

        for (int i=0; i<array.length; i++){
            System.out.println("miejsce numer " + i + " w tablicy ma wartość " + array[i]);
        }
    }

}
