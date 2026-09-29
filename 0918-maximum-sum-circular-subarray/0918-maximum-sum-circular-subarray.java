class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;
        int max = nums[0];
        int min = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 0; i < nums.length; i++) {

            total += nums[i];

            if (i > 0) {
                currentMax = Math.max(nums[i], currentMax + nums[i]);
                max = Math.max(max, currentMax);

                currentMin = Math.min(nums[i], currentMin + nums[i]);
                min = Math.min(min, currentMin);
            }
        }

        if (max < 0) {
            return max;
        }

        return Math.max(max, total - min);
    }
}