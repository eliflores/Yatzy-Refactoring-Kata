package rules;

public class ThreeOfAKind implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] t;
        t = new int[6];
        //TODO remove dup code
        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            t[dice - 1]++;

        }
        for (int i = 0; i < 6; i++)
            if (t[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }
}
