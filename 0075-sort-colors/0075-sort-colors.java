class Solution {
    public void sortColors(int[] nums) {
         int i=0;
         int mid=0;
         int end = nums.length -1;
           while(mid <= end){
             if(nums[mid]==0){
               int temp =nums[mid];
               nums[mid]=nums[i];
               nums[i]=temp;
                i++;
                mid++;
             }else if(nums[mid] == 1 ) {
                mid++;
             }else if(nums[mid]==2){
               int temp=nums[mid];
               nums[mid]=nums[end];
               nums[end]=temp;
                end--;
             }
           }
        }
    }
