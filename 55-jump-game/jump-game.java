class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length - 1;

        for (int i = len; i >= 0; i--) {
            if (nums[i] + i >= len) {
                len = i;
            }
        }

        return len == 0;
    }
}