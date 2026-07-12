class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int value : sorted) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        int[] rankArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rankArr[i] = rankMap.get(arr[i]);
        }

        return rankArr;
    }
}