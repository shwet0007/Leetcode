class Solution {
    public int maxProduct(int n) {
        List<Integer> digits = new ArrayList<>();
        while(n>0){
            int lastDigit = n % 10;
            digits.add(lastDigit);
            n = n/10;
        }
        
        Collections.sort(digits);
        int n1 = digits.get(digits.size()-1);
        int n2 = digits.get(digits.size()-2);
        int maxProduct = n1 * n2;

        return maxProduct;
    }
}