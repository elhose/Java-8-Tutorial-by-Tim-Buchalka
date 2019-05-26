import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_8_11 {

    public static void main(String[] args) {
        //chalenge 8

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("(\\w+).(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println(matcher8.group(2));
        }

        //challenge 9

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("(\\w+)\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()){
            System.out.println(matcher9.group(2));
        }

        //challenge 10
        matcher9.reset();
        while (matcher9.find()){
            System.out.println(matcher9.start(2) + " : " + (matcher9.end(2)-1));
        }

        //challenge 11

        String challenge11 = "{0, 2},{0, 5},{1, 3},{2, 4}";
        Pattern pattern11 = Pattern.compile("(\\{\\d+, \\d+})");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){
            System.out.println(matcher11.group(1));
        }
    }

}
