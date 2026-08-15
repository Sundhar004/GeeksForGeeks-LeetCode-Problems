class Solution {
    public int longestSubsequence(int[] nums) {
        boolean nonZero = false;
        int xor = 0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
            if(nums[i] > 0) nonZero = true;
        }
        if(xor != 0) return nums.length;
        if(nonZero) return nums.length-1;
        return 0;
    }
}