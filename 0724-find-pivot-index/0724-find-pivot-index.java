class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
            int leftSum = prefix[i-1];
            int rightSum = sum - prefix[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;

    }
}