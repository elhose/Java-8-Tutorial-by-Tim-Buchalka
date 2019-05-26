import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametryzed {

    private Utilities utilities;
    private String input;
    private String output;

    public UtilitiesTestParametryzed(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @org.junit.Before
    public void setUp() throws Exception {
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF","ABCDEF"},
                {"AB88EFFG","AB8EFG"},
                {"12233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}


        });
    }


    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(output, utilities.removePairs(input));
    }


}
