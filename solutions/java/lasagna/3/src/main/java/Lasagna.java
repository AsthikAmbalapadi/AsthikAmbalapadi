public class Lasagna {
    public int expectedMinutesInOven() {
        int EXPECTED_MINUTES_IN_OVEN = 40;
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int x) {
        int REMAINING_MINUTES_IN_OVEN = expectedMinutesInOven() - x;
        return REMAINING_MINUTES_IN_OVEN;
    }
    public int preparationTimeInMinutes(int x) {
        int PREPARATION_TIME = 2 * x;
        return PREPARATION_TIME;
    }
    public int totalTimeInMinutes(int x, int y) {
        int TOTAL_TIME = preparationTimeInMinutes(x) + y;
        return TOTAL_TIME;
    }
}