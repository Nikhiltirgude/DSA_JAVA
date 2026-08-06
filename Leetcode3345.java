class Solution {
    public int smallestNumber(int n, int t) {
          int ans = n;
        while (true) {
            if (digitProduct(ans) % t == 0) {
                return ans;
            }
            ans++;
        }
    }

    private int digitProduct(int num) {
        int prod = 1;
        while (num > 0) {
            prod *= (num % 10);
            num /= 10;
        }
        return prod;
    
    }
}