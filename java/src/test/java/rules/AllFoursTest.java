package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllFoursTest {
    private AllFours allFours = new AllFours();

    @Test
    public void score() throws Exception {
        assertEquals(12, allFours.score(4, 4, 4, 5, 5));
        assertEquals(8, allFours.score(4, 4, 5, 5, 5));
        assertEquals(4, allFours.score(4, 5, 5, 5, 5));
    }

}