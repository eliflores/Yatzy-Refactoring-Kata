package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourOfAKindTest {
    private FourOfAKind fourOfAKind = new FourOfAKind();

    @Test
    public void score() throws Exception {
        assertEquals(12, fourOfAKind.score(3, 3, 3, 3, 5));
        assertEquals(20, fourOfAKind.score(5, 5, 5, 4, 5));
    }
}