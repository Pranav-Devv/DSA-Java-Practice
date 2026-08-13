class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] ans=new int[nums.length];
      int j=0;
      for(int i=0;i<n;i++){
         ans[j]=nums[i];
         j++;
         ans[j]=nums[i+n];
         j++;
      }  
      return ans;
    }
}
/* 1.Create a new array for the answer
   2.j = position where we put the answer
   3.Loop through the first half
   4.Take element from second half
   5.Take element from second half
   6. Then return the answer */