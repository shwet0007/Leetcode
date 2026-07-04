class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maxFrq =-1;
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
         for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i])>maxFrq){
                maxFrq= freq.get(nums[i]);
                ans = nums[i];
            }
        }

        return ans;
        
    }
}