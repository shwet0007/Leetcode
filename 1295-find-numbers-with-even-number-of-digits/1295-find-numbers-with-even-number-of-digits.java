class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(even(nums[i]))
            count++;
        }
        return count;
}
    static boolean even(int num){
        int noOfdigits = digits(num);
        return noOfdigits%2==0;
    }

     static int digits(int num){
            int counttt=0;
           while(num>0){
            counttt++;
            num= num/10;
           }
           return counttt;
    
        }
}