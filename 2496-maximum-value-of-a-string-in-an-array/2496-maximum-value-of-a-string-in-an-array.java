class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            boolean isNumber = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch < '0' || ch > '9') {
                    isNumber = false;
                    break;
                }
            }

            int value;

            if (isNumber) {
                value = Integer.parseInt(str);
            } else {
                value = str.length();
            }

            maxValue = Math.max(maxValue, value);
        }

        return maxValue;
    }
}