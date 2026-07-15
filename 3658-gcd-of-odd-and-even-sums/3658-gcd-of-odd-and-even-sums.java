class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = sumOdd(n);
        int b = sumEven(n);
        while (a>0 && b>0) {
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }

        return a;
    }
    public int sumOdd(int n){
        
        return n*n;
        
    }
    public int sumEven(int n){
        
        return n*(n+1);
        
    }
}