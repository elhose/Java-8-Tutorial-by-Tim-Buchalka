import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_1_7 {

    public static void main(String[] args) {


        //challenge 1
        String challenge1 = "I want a bike.";
        Pattern pattern1 = Pattern.compile("I want a bike.");
        Matcher matcher1 = pattern1.matcher(challenge1);
        System.out.println(matcher1.matches());

        //challenge 2
//        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a \\w+."));
        System.out.println(challenge2.matches("(I want a )(\\w+.)"));

        //challenge 3

        Pattern pattern3 = Pattern.compile("I want a (bike|ball).");
        Matcher matcher3 = pattern3.matcher(challenge1);
        Matcher matcher3_1 = pattern3.matcher(challenge2);

        System.out.println(matcher3.matches());
        System.out.println(matcher3_1.matches());

        //challenge 4

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ","_"));

        //challenge 5

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));

        //challenge 6

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        //challenge 7

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^\\w+.\\d+$"));

    }
}
