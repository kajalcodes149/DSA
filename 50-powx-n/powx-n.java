class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        double ans = 1.0;

        if (exp < 0) {
            exp = -exp;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                ans *= x;
            }

            x *= x;
            exp /= 2;
        }

        if (n < 0) {
            return 1.0 / ans;
        }

        return ans;
    }
}