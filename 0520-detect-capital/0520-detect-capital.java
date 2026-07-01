class Solution {
    public boolean detectCapitalUse(String words) {
        int count =0;
        for(int i=0;i<words.length();i++){
            char ch = words.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }

        }
        if(count==words.length()){
            return true;
        }else if(count==1 && (words.charAt(0) >= 'A' && words.charAt(0) <= 'Z')){
            return true;
        }else if(count ==0){
            return true;
        }

        return false;
    }
}