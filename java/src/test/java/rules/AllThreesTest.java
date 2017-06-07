package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllThreesTest {
    private AllThrees allThrees = new AllThrees();

    @Test
    public void score() throws Exception {
        assertEquals(6, allThrees.score(1, 2, 3, 2, 3));
        assertEquals(12, allThrees.score(2, 3, 3, 3, 3));

    }
}