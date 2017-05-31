package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeOfAKindTest {
    private ThreeOfAKind threeOfAKind = new ThreeOfAKind();

    @Test
    public void score() throws Exception {
        assertEquals(9, threeOfAKind.score(3, 3, 3, 4, 5));
        assertEquals(15, threeOfAKind.score(5, 3, 5, 4, 5));
        assertEquals(9, threeOfAKind.score(3, 3, 3, 3, 5));
    }

}