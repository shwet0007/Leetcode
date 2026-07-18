class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        List<Integer> ans1 = new ArrayList<>();
        int i=0;
        while(i<=nums1.length-1){
            h1.add(nums1[i]);
            i++;
        }
        int j=0;
        while(j<=nums2.length-1){
            h2.add(nums2[j]);
            j++;
        }
        for (int num : h1) {
           if (h2.contains(num)) {
             ans1.add(num);
        }
}
        int[] ans = new int[ans1.size()];

        for (int l = 0; l < ans1.size(); l++) {
            ans[l] = ans1.get(l);
        }

      return ans;


 
    }
}