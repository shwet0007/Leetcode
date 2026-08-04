class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> miss = new ArrayList<>();
        Arrays.sort(nums);
        int high = nums[nums.length-1];
        int low =nums[0];
        HashSet<Integer> number = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            number.add(nums[i]);
        }
        
        for(int i=low;i<=high;i++){
            if(!number.contains(i)){
                miss.add(i);
            }

        }
        return miss;
    }
}