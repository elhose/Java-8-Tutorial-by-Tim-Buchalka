import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));

        System.out.println(alphanumeric.replaceAll("[aei]","I replaced letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));

        //LEKCJA 289

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";

        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\\S",""));

        System.out.println(newAlphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhitespace.replaceAll("\\w","X"));
        System.out.println(hasWhitespace.replaceAll("\\b","X"));

        //LEKCJA 290

        String thirdAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDeee","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h*i*j+","YYY"));

        StringBuilder  htmlText = new StringBuilder("<h1>My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());



        //LEKCJA 291
        matcher.reset();
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


        String h2GroupPattern = "(<h2>.*?</h2>)";       //? zmienia z greedy na lazy expression
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurence: " + groupMatcher.group(1));
        }


        String h2TextGroups ="(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }


        //Lekcja 292

        System.out.println("harry".replaceAll("[H|h]arry","Larry"));
        System.out.println("harry".replaceAll("[H|h]arry","Larry"));

        String tvTest = "tstvtkt";
       // Pattern tvPattern = Pattern.compile("t[^v]");
        Pattern tvPattern = Pattern.compile("t(?!v)");
        Matcher tvMatcher = tvPattern.matcher(tvTest);

        count = 0;
        while (tvMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " +tvMatcher.start() + " : " + tvMatcher.end());
        }


    }
}
