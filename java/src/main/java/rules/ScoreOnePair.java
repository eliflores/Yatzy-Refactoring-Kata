package rules;

class ScoreOnePair implements ScoringRule {

    @Override
    public int score(int... dices) {
        int[] counts = getTallies(dices);
        int at;
        for (at = 0; at != 6; at++)
            if (counts[6 - at - 1] >= 2)
                return (6 - at) * 2;
        return 0;
    }

}
