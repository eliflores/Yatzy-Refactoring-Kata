package rules;

public class FourOfAKind implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies;
        tallies = new int[6];

        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            tallies[dice - 1]++;

        }

        for (int i = 0; i < 6; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }
}
