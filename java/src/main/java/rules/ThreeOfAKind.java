package rules;

public class ThreeOfAKind implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] t = getTallies(dices);
        for (int i = 0; i < 6; i++)
            if (t[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }
}
