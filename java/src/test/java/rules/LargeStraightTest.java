package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargeStraightTest {
    @Test
    public void score() throws Exception {
        assertEquals(20, new LargeStraight().score(6, 2, 3, 4, 5));
        assertEquals(20, new LargeStraight().score(2, 3, 4, 5, 6));
        assertEquals(0, new LargeStraight().score(1, 2, 2, 4, 5));
    }
}