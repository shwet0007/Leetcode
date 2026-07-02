class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> current = new ArrayList<>();
         boolean[] seen = new boolean[nums.length];
         permutations(nums,seen,current,res);
         return res;
    }
    public void permutations(int[] nums,boolean[] seen ,List<Integer> current, List<List<Integer>> res){
        if(nums.length == current.size()){
            res.add(new ArrayList<>(current));
        }

        for(int i=0;i<nums.length;i++){ //check all index
            if(seen[i]){
                continue;//agar particular index ka element already incuded toh do not take that element
            }
         if(i>0 && nums[i-1]==nums[i]&& !seen[i-1]){
            continue;
         }
         seen[i] = true;
         current.add(nums[i]);//adding the elemnt in list
         permutations(nums,seen,current,res);//recursive call
         seen[i] = false;
         current.remove(current.size()-1);//backtracking and removing the element 
        }
    }
}