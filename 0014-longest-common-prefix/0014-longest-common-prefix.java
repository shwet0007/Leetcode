class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String s1 = strs[0];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>= strs[j].length() || strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }

       return sb.toString();
    }
}