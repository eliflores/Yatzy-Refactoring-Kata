package rules;

public class AllFives implements ScoringRule {
    @Override
    public int score(int... dices) {
        return sumDice(5, dices);
    }
}
