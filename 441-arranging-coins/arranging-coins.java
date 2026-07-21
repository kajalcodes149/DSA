class Solution {
    
    public int arrangeCoins(long n) {
        if (n == 0) return 0;
        long lo = 0, hi = n, ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long coins = mid * (mid + 1) / 2;  
            if (coins == n) {
                return (int) mid;
            } else if (coins <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return (int) ans;
    }

    
    public int arrangeCoins(int n) {
        long m = (long) n;
        return (int) ((Math.sqrt(8 * m + 1) - 1) / 2);
    }
}
