class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int value;
            if (str.matches("\\d+")) {
                value = Integer.parseInt(str);
            } else {
                value = str.length();
            }

            maxValue = Math.max(maxValue, value);
        }

        return maxValue;
    }
}