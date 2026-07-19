class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        // String[] s1 = s.split(" +");
        // String s2 = s1[s1.length-1];
        // return s2.length();
        int count =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' ' ){
               count++;
            }else{
                break;
            }
            
        }
        return count;
        
    }
}