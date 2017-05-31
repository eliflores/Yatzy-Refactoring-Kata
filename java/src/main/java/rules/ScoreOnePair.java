package rules;

class ScoreOnePair implements ScoringRule {

    @Override
    public int score(int... dices) {
        int[] counts = new int[6];

        //TODO remove dup code
        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            counts[dice - 1]++;

        }
        int at;
        for (at = 0; at != 6; at++)
            if (counts[6 - at - 1] >= 2)
                return (6 - at) * 2;
        return 0;
    }

}
