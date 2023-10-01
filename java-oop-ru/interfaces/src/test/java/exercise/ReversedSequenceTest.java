package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReversedSequenceTest {
    ReversedSequence input;
    ReversedSequence emptyInput;
    @BeforeEach
    public void setUp() {
        input = new ReversedSequence("qwerty123");
        emptyInput = new ReversedSequence("");
    }
    @Test
    public void lengthTest() {
        int expected1 = 9;
        int actual1 = input.length();
        Assertions.assertEquals(expected1, actual1);
        int expected2 = 0;
        int actual2 = emptyInput.length();
        Assertions.assertEquals(expected2, actual2);
    }
    @Test
    public void toStringTest() {
        String expected1 = "321ytrewq";
        String actual1 = input.toString();
        Assertions.assertEquals(expected1, actual1);
        String expected2 = "";
        String actual2 = emptyInput.toString();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void subSequenceTest() {
        String expected1 = "ytrewq";
        String actual1 = input.subSequence(0, 6);
        Assertions.assertEquals(expected1, actual1);
    }
}
