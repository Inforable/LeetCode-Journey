class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        long[] suffix = new long[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.min(nums[i], suffix[i + 1]);
        }

        long maks = Long.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            maks = Math.max(maks, prefix[i] - suffix[i + 1]);
        }

        return maks;
    }
}