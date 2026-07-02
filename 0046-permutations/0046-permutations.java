class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
         permutations(nums,current,res);
         return res;
    }
    public void permutations(int[] nums,List<Integer> current, List<List<Integer>> res){
        if(nums.length == current.size()){
            res.add(new ArrayList<>(current));
        }

        for(int i=0;i<nums.length;i++){ //check all index
            if(current.contains(nums[i])){//if already included skip
                continue;
            }
         current.add(nums[i]);//adding the elemnt in list
         permutations(nums,current,res);//recursive call
         current.remove(current.size()-1);//backtracking and removing the element 
        }
    }
}