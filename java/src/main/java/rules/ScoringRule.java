package rules;

interface ScoringRule {
    int score(int... dices);

    default int[] getTallies(int[] dices) {
        int[] tallies = new int[6];

        for (int dice : dices) {
            tallies[dice - 1]++;

        }
        return tallies;
    }
}
