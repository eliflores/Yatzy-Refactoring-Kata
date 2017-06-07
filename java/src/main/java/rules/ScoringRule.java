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

    default int sumDice(int target, int... dices) {
        // TODO maxAllowedDices is a temporal validation until we change int... dices to a model class.
        final int maxAllowedDices = 5;
        assert dices.length <= maxAllowedDices;
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            int diceValue = dices[i];
            if (diceValue == target) {
                sum += diceValue;
            }
        }

        return sum;
    }

}
