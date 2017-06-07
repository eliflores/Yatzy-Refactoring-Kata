package rules;

public class AllSixes implements ScoringRule {

    @Override
    public int score(int... dices) {
        return sumDice(6, dices);
    }
}
