import java.util.Scanner;



public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj ilośc liczb do sprawdzenia");
        int number = scanner.nextInt();

        int[] array = getIntegers(number);
        printArray(array);
        System.out.println();
        System.out.println();
        printArray(sortIntegers(array));
        System.out.println();
        System.out.println();
        printArray(array);
    }

    public static int[] getIntegers(int number){
        System.out.println("wprowadź " + number + " liczb \r");
        int[] array = new int[number];
        for (int i=0;i<number;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("pozycja " + i + " w liście ma wartość " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] array){
        int[] sortedArray = new int[array.length];
        int max = -2147483648;
        for (int i=0;i<array.length;i++){

            for(int j=0;j<array.length;j++){
                if (array[j]>=max) {
                    sortedArray[i]= array[j];
                    max = array[j];
                }
            }

            int licznik=0;

            while( licznik< array.length){
                if(sortedArray[i]==array[licznik]) {array[licznik] = -2147483648; break;}

                licznik++;
            }
            max = -2147483648;
        }

        return sortedArray;
    }

}
