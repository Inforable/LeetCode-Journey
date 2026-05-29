class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long min = 0;
        if (need1 == 0 && need2 == 0) {
            return min;
        }

        if (costBoth <= (cost1 + cost2)) {
            if (need1 == need2) {
                min += 1L * need1 * costBoth;
            } else if (need1 > need2) {
                min += 1L * need2 * costBoth;
                if (costBoth <= cost1) {
                    min += 1L * (need1 - need2) * costBoth;
                } else {
                    min += 1L * (need1 - need2) * cost1;
                }
            } else {
                min += 1L * need1 * costBoth;
                if (costBoth <= cost2) {
                    min += 1L * (need2 - need1) * costBoth;
                } else {
                    min += 1L * (need2 - need1) * cost2;
                }
            }
        } else {
            min += 1L * need1 * cost1 + 1L * need2 * cost2;
        }

        return min;
    }
}