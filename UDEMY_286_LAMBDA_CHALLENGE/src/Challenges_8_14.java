import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Challenges_8_14 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

//        System.out.println(topNames2015(names).toString());
//        System.out.println("***************");


        List<String> sortedList = new ArrayList<>();
        Stream<String> stream = sortedList.stream();


        names.stream()
                .map((String name) ->  name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();


        long namesBeginningWithA = names.stream()
                .map((String name) -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter((String name) -> name.startsWith("A"))
                .count();

        System.out.println(namesBeginningWithA);
    }


    public static List<String> topNames2015(List<String> list){

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        //list.sort((String o1, String o2) -> o1.compareToIgnoreCase(o2));

        List<String> sortedList = new ArrayList<>(list);

        sortedList.sort(String::compareToIgnoreCase);

        String temp;
        for (int i=0; i<sortedList.size(); i++){

            temp = sortedList.get(i).substring(0,1).toUpperCase();
            temp = temp.concat(sortedList.get(i).substring(1));
            sortedList.set(i,temp);
        }

        return sortedList;
    }
}
