class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        int[] arr = new int[total];
        k = k % arr.length;
        int index = 0;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index] = grid[i][j];
                index++;
            }
        }

        
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        List<List<Integer>> ans = new ArrayList<>();
             index = 0;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(arr[index]);
                index++;
            }
            ans.add(row);
        }

        return ans;
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}