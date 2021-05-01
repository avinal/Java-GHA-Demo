package demo.avinal.gha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    @DisplayName("Should print Greetings!!")
    public void testGreetings() {
        assertEquals("Hello I am Avinal", App.greetings("Avinal"));
        assertEquals("Hello I am Java", App.greetings("Java"));
    }

    @Test
    @DisplayName("Should reverse names")
    public void testReversal() {
        assertEquals("lanivA", App.reversal("Avinal"));
        assertEquals("avaJ", App.reversal("Java"));
    }
}
