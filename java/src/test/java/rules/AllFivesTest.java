package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllFivesTest {
    private AllFives allFives = new AllFives();

    @Test
    public void score() throws Exception {
        assertEquals(10, allFives.score(4, 4, 4, 5, 5));
        assertEquals(15, allFives.score(4, 4, 5, 5, 5));
        assertEquals(20, allFives.score(4, 5, 5, 5, 5));
    }

}