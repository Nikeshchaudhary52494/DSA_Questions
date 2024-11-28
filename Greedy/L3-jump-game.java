class Solution {
    public boolean canJump(int[] nums) {
        // check the maximum index that can be reached
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex) return false;
            maxIndex = Math.max(nums[i]+i,maxIndex);
        }
        return true;
    }
}