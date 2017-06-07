package rules;

public class AllOnes implements ScoringRule {
    @Override
    public int score(int... dices) {
        return sumDice(1, dices);
    }
}
