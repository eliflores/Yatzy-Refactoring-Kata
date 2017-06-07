public class Yatzy {

    private static final int MAX_ALLOWED_DICES = 5;
    protected int[] dice; //TODO remove?

    //TODO remove?
    public Yatzy(int d1, int d2, int d3, int d4, int _5) {
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
    }


    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        int total = 0;
        total += d1;
        total += d2;
        total += d3;
        total += d4;
        total += d5;
        return total;
    }

    public static int yatzy(int... dice) {
        int[] counts = new int[6];
        for (int die : dice)
            counts[die - 1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }

    //TODO rename?
    private static int sumDice(int target, int... dices) {
        assertDicesInRange(dices);
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            int diceValue = dices[i];
            if (diceValue == target) {
                sum += diceValue;
            }
        }

        return sum;
    }

    //TODO remove
    private static void assertDicesInRange(int[] dices) {
        assert dices.length <= MAX_ALLOWED_DICES;
    }

    public static int ones(int... dices) {
        return sumDice(1, dices);
    }

    public static int twos(int... dices) {
        return sumDice(2, dices);
    }

    public static int threes(int... dices) {
        return sumDice(3, dices);
    }

    public static int fours(int... dices) {
        return sumDice(4, dices);
    }

    public static int fives(int... dices) {
        return sumDice(5, dices);
    }

    public static int sixes(int... dices) {
        return sumDice(6, dices);
    }
}


