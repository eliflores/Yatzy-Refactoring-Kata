package rules;

public class LargeStraight implements ScoringRule {
    @Override
    public int score(int... dices) {
        int[] tallies;
        tallies = new int[6];

        //TODO remove dup code
        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            tallies[dice - 1]++;

        }
        if (tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1
                && tallies[5] == 1)
            return 20;
        return 0;
    }
}
