class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j=  n;
        int k = 0;
        while(i<=n-1 && j<nums.length){
             arr[k] = nums[i];
             arr[k+1] = nums[j];
             i++;
             j++;
             k = k+2;
        }
        return arr;
    }
}