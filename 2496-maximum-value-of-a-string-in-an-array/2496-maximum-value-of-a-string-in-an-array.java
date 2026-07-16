class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        for(int i=0;i<strs.length;i++){
            String current = strs[i];
            boolean isNum = true;

            for(int j=0;j<current.length();j++){
                char ch = current.charAt(j);
                if(ch < '0' || ch > '9'){
                    isNum = false;
                    break;
                }
            }
            int val;
            if(isNum){
                val = Integer.parseInt(current);
            }else{
                val = current.length();
            }
            maxVal = Math.max(val,maxVal);
        }
        return maxVal;
    }
}