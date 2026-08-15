class Solution { 
    public int singleNumber(int[] nums) { 
        
        int ans = 0; // Start answer with 0
        
        // Go through every element of the array
        for (int i = 0; i < nums.length; i++) { 
            
            // XOR current element with ans
            // Duplicate numbers cancel each other
            ans = ans ^ nums[i]; 
        } 
        
        // Return the number that appears only once
        return ans; 
    } 
}