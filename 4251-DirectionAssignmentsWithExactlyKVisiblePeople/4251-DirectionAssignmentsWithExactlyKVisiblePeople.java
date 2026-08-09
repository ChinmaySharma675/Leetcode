// Last updated: 8/9/2026, 6:50:46 PM
class Solution {
    static final long MOD = 1_000_000_007L;
    
    public int countVisiblePeople(int n, int pos, int k) {
   
        long[] fact = new long[n + 1];
        long[] inv_fact = new long[n + 1];
        
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        
        inv_fact[n] = modPow(fact[n], MOD - 2, MOD);
        for (int i = n - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i+1] * (i+1) % MOD;
        }
        
        int L = pos;           // people to the left
        int R = n - 1 - pos;   // people to the right
        
        long ans = 0;
        for (int j = 0; j <= k; j++) {
            int r = k - j;
            if (j <= L && r <= R) {
                long combL = fact[L] * inv_fact[j] % MOD * inv_fact[L-j] % MOD;
                long combR = fact[R] * inv_fact[r] % MOD * inv_fact[R-r] % MOD;
                ans = (ans + combL * combR) % MOD;
            }
        }
        
        
        return (int)(ans * 2 % MOD);
    }
    
    private long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}