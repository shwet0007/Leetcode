class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i], h1.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0;i<nums.length;i++){
            if(h1.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}