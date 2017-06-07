package rules;

public class AllTwos implements ScoringRule {
    @Override
    public int score(int... dices) {
        return sumDice(2, dices);
    }
}
