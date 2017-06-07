package rules;

public class FourOfAKind implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies = getTallies(dices);

        for (int i = 0; i < 6; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }
}
