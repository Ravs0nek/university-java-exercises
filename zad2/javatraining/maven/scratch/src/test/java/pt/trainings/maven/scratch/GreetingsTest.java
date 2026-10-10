package pt.trainings.maven.scratch;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingsTest {

    @Test
    public void testSayHelloWithNull() {
        Greetings greetings = new Greetings();
        String result = greetings.sayHello(null);
        assertEquals("Hello John Doe", result);
    }

    @Test
    public void testSayHelloWithName() {
        Greetings greetings = new Greetings();
        String result = greetings.sayHello("Milosz");
        assertEquals("Hello Milosz", result);
    }
}