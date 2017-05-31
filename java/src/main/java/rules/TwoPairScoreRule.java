package rules;

public class TwoPairScoreRule implements ScoringRule {

    @Override
    public int score(int... dices) {
        int[] counts = new int[6];

        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            counts[dice - 1]++;

        }

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
