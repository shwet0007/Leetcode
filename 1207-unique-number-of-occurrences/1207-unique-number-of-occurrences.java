class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        HashSet<Integer> frequency = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        for(int num : h1.values()){
            if(frequency.contains(num)){
                return false;
            }else{
                frequency.add(num);
            }
        }
        return true;
    }
}