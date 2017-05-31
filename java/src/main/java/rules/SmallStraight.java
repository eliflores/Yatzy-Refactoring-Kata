package rules;

public class SmallStraight implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies;
        tallies = new int[6];

        //TODO remove dup code
        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            tallies[dice - 1]++;

        }

        if (tallies[0] == 1 &&
                tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1)
            return 15;
        return 0;
    }
}
