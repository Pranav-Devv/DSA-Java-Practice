class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0; // Position where we put valid elements

        // Check every element in the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is not equal to val
            if (nums[i] != val) {

                // Copy the valid element to count position
                nums[count] = nums[i];

                // Move to the next position
                count++;
            }
        }

        // Return number of elements left
        return count;
    }
}
 /*i → checks every element
count → stores valid elements
!= val → keep the element
count++ → move to next position
return count → number of valid elements*/