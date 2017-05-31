package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallStraightTest {
    @Test
    public void score() throws Exception {
        assertEquals(15, new SmallStraight().score(1, 2, 3, 4, 5));
        assertEquals(15, new SmallStraight().score(2, 3, 4, 5, 1));
        assertEquals(0, new SmallStraight().score(1, 2, 2, 4, 5));
    }
}