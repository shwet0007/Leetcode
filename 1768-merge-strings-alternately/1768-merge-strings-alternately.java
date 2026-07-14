class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        int i= 0;
        int j= 0;
        while(i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }
        while(j < s2.length()){
            
            sb.append(s2.charAt(j));
            
            j++;
        }
        while(i < s1.length()){
            
            sb.append(s1.charAt(i));
            
            i++;
        }




        return sb.toString();


    }
}