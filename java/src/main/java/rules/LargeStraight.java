package rules;

public class LargeStraight implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies = getTallies(dices);
        if (tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1
                && tallies[5] == 1)
            return 20;
        return 0;
    }
}
