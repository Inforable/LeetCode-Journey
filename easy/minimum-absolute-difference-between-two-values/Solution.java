class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int minimumAbsolute = Integer.MAX_VALUE;
        int a = -1;
        int b = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                a = i;
            }
            if (nums[i] == 2) {
                b = i;
            }
            
            if (a != -1 && b != -1) {
                int temp = Math.abs(a - b);
                if (temp < minimumAbsolute) {
                    minimumAbsolute = temp;
                }
            }
        }

        if (minimumAbsolute == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minimumAbsolute;
        }
    }
}