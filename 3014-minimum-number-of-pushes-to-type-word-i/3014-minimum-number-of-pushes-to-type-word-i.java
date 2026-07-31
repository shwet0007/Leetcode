class Solution {
    public int minimumPushes(String word) {
        
        int sum=0;
        for(int l=0;l<word.length();l++){
            if(l<8){
          sum += 1;
        }else if(l<16){
            sum += 2;
        }else if(l<24){
            sum += 3;
        }else{
            sum += 4;
        } 
        }
       
        return sum;
    }
}