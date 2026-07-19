class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] s1 = s.split(" +");
        String s2 = s1[s1.length-1];
        return s2.length();
        
    }
}