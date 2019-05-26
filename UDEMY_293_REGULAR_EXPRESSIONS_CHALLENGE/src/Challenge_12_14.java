import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_12_14 {

    public static void main(String[] args) {
        //challenge 12

        String challenge12 = "11111";
        Pattern pattern12 = Pattern.compile("^\\d{5}$");
        Matcher matcher12 = pattern12.matcher(challenge12);
        System.out.println(matcher12.matches());

        //challenge 13

        String challenge13 = "11111-1111";
        Pattern pattern13 = Pattern.compile("^\\d{5}-\\d{4}$");
        Matcher matcher13 = pattern13.matcher(challenge13);
        System.out.println(matcher13.matches());

        //challenge 14


        Pattern pattern14 = Pattern.compile("^\\d{5}($|-\\d{4}$)");
        Matcher matcher14 = pattern14.matcher(challenge12);
        Matcher matcher14_1 = pattern14.matcher(challenge13);
        System.out.println(matcher14.matches());
        System.out.println(matcher14_1.matches());
    }

}
