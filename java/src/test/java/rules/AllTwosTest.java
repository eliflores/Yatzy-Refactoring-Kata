package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllTwosTest {
    private AllTwos allTwos = new AllTwos();

    @Test
    public void score() throws Exception {
        assertEquals(4, allTwos.score(1, 2, 3, 2, 6));
        assertEquals(10, allTwos.score(2, 2, 2, 2, 2));
    }

}