package rules;

public class AllThrees implements ScoringRule {
    @Override
    public int score(int... dices) {
        return sumDice(3, dices);
    }
}
