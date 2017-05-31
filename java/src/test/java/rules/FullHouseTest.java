package rules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullHouseTest {
    @Test
    public void score() throws Exception {
        assertEquals(18, new FullHouse().score(6, 2, 2, 2, 6));
        assertEquals(0, new FullHouse().score(2, 3, 4, 5, 6));
    }

}