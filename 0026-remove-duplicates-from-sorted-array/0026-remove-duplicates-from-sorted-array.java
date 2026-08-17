// Time complexity = O(n)
//space complexity =O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
//Logic is simple for revison :
/* 1) Take two pointers: i and j.
   2) i stays at the position of the last unique number.
   3) j checks each number in the array.
   4) If nums[i] and nums[j] are different:
   5) Move i forward.
   6) Put nums[j] at nums[i].
   7) At the end, i + 1 gives the number of unique elements.*/