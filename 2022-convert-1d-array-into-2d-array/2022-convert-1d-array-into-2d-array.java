class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int index=0;
        if (original.length != m * n) {
            return new int[0][0];
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=original[index];
                index++;
            }
        }
        return ans;
    }
}