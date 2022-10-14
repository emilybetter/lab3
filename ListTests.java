import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class ListTests{
    @Test
    public void testFilter() {
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();

        actual.add("first");
        actual.add("second");
        actual.add("third");

        expected.add("first");
        expected.add("third");

        StringChecker sc = new containsI();
        assertEquals(expected, ListExamples.filter(actual, sc));
}
}