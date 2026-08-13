class Solution {
    public int[] runningSum(int[] nums) {
       for(int i=1; i<nums.length;i++){
        // Add current element + previous sum
         nums[i]=nums[i]+nums[i-1];
       } 
        // Return the updated array
       return nums;
    }
}
        // Array: [1, 2, 3, 4]
        // Index:  0  1  2  3
        // we have set the array index i at 1 postion.
        // i = index of the current element
        // nums[i] = current element
        // nums[i - 1] = previous element
        //
        // We add the previous sum to the current element.
        //
        // Example:
        // i = 1 → nums[1] = 2 + nums[0] = 1 → 3
        // i = 2 → nums[2] = 3 + nums[1] = 3 → 6
        // i = 3 → nums[3] = 4 + nums[2] = 6 → 10
