package rules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreOnePairTest {
    @Test
    public void score() throws Exception {
        assertEquals(6, new ScoreOnePair().score(3, 4, 3, 5, 6));
        assertEquals(10, new ScoreOnePair().score(5, 3, 3, 3, 5));
        assertEquals(12, new ScoreOnePair().score(5, 3, 6, 6, 5));
    }

}