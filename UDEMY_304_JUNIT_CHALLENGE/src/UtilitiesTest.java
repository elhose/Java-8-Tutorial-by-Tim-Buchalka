import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setUp() throws Exception {
         utilities = new Utilities();
        System.out.println("Przed każdą metodą");
    }

    @org.junit.Test
    public void everyNthChar() throws Exception {
        assertArrayEquals(new char[] {'e','l'},utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2));
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'},utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},7));

    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertEquals("12315125",utilities.removePairs("123331555125"));
        assertEquals(" ",utilities.removePairs("           "));
        assertEquals("",utilities.removePairs(""));
        assertNull(utilities.removePairs(null));

    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void converter_DivideByZero() throws Exception {
        assertEquals(300, utilities.converter(10,0));
    }

    @org.junit.Test
    public void converter() throws Exception {
        assertEquals(300, utilities.converter(10,5));
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        assertNull(utilities.nullIfOddLength("odd"));
        assertEquals("even",utilities.nullIfOddLength("even"));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Po każdej metodzie");
    }
}