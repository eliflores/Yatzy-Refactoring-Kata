package rules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPairScoreRuleTest {

    @Test
    public void testScore() {
        assertEquals(16, new TwoPairScoreRule().score(3, 3, 5, 4, 5));
        assertEquals(16, new TwoPairScoreRule().score(3, 3, 5, 5, 5));
    }

}