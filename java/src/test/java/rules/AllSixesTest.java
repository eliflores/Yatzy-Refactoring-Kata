package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllSixesTest {
    private AllSixes allSixes = new AllSixes();

    @Test
    public void score() throws Exception {
        assertEquals(0, allSixes.score(4, 4, 4, 5, 5));
        assertEquals(6, allSixes.score(4, 4, 6, 5, 5));
        assertEquals(18, allSixes.score(6, 5, 6, 6, 5));
    }

}