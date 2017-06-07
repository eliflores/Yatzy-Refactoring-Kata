import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyTest {
    @Test
    public void chanceScoresSumOfAllDices() {
        int expected = 15;
        int actual = Yatzy.chance(2, 3, 4, 5, 1);
        assertEquals(expected, actual);
        assertEquals(16, Yatzy.chance(3, 3, 4, 5, 1));
    }

    @Test
    public void yatzyScores50() {
        int expected = 50;
        int actual = Yatzy.yatzy(4, 4, 4, 4, 4);
        assertEquals(expected, actual);
        assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
        assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 3));
    }
}
