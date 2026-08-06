class Solution {
    public int smallestNumber(int n, int t) {
        int ans = -1;
        for(int i=n ;i<=100;i++){
            int num=1;
            int copy = i;
            while(copy>0){
                int last = copy % 10;
                num *= last;
                copy = copy / 10;
            }
            if(num % t == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}