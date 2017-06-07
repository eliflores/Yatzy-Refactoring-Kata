package rules;

public class TwoPairScoreRule implements ScoringRule {

    @Override
    public int score(int... dices) {
        int[] counts = getTallies(dices);

        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (counts[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;

    }
}
