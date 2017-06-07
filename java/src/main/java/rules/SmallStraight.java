package rules;

public class SmallStraight implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies = getTallies(dices);

        if (tallies[0] == 1 &&
                tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1)
            return 15;
        return 0;
    }
}
