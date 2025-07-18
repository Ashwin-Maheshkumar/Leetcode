class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int minlenwindow=Integer.MAX_VALUE;
         int currsum=0;
         int low=0;
         int high=0;
         while(high<nums.length){
            currsum+=nums[high];
            high++;
            while(currsum>=target){
                int window=high-low;
                minlenwindow=Math.min(window,minlenwindow);
                currsum-=nums[low];
                low++;
            }
         }
         return minlenwindow==Integer.MAX_VALUE ? 0:minlenwindow;
    }
}