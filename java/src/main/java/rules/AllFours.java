package rules;

public class AllFours implements ScoringRule {
    @Override
    public int score(int... dices) {
        return sumDice(4, dices);
    }
}
