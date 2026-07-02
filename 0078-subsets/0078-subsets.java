class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subSequence(0,nums,current,res);
        return res;
    }
    public void subSequence(int index,int[] nums, List<Integer> current,List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);//include element
        subSequence(index+1,nums,current,res);// recursion call of pick case

        current.remove(current.size()-1);//removing the element when backtrack
        subSequence(index+1,nums,current,res);// no pick recursion call





    }
}