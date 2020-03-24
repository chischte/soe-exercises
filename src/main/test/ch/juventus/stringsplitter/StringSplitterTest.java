package ch.juventus.stringsplitter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplitterTest {
    StringSplitter stringSplitter = new StringSplitter();

    @Test
    public void returnFirstCharTest() {
        char charReturned = stringSplitter.getFirstChar("ABC");
        String stringExpected="A";
        char charExpected=stringExpected.charAt(0);
        assertEquals(charReturned==charExpected, true);
    }
}
