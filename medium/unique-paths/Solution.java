class Solution {
    public int uniquePaths(int m, int n) {
        int a = m + n - 2;
        int b = Math.min(a - (m - 1), m - 1);

        long result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * (a - b + i) / i;
        }

        return (int) result;
    }
}