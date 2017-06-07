package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllOnesTest {
    private AllOnes allOnes = new AllOnes();

    @Test
    public void score() throws Exception {
        assertEquals(1, allOnes.score(1, 2, 3, 4, 5));
        assertEquals(2, allOnes.score(1, 2, 1, 4, 5));
        assertEquals(0, allOnes.score(6, 2, 2, 4, 5));
        assertEquals(4, allOnes.score(1, 2, 1, 1, 1));
    }

}