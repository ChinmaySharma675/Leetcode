// Last updated: 3/28/2026, 8:54:14 PM
1class Solution {
2    static final long MOD = 1_000_000_007L;
3    
4    public int countVisiblePeople(int n, int pos, int k) {
5   
6        long[] fact = new long[n + 1];
7        long[] inv_fact = new long[n + 1];
8        
9        fact[0] = 1;
10        for (int i = 1; i <= n; i++) {
11            fact[i] = fact[i-1] * i % MOD;
12        }
13        
14        inv_fact[n] = modPow(fact[n], MOD - 2, MOD);
15        for (int i = n - 1; i >= 0; i--) {
16            inv_fact[i] = inv_fact[i+1] * (i+1) % MOD;
17        }
18        
19        int L = pos;           // people to the left
20        int R = n - 1 - pos;   // people to the right
21        
22        long ans = 0;
23        for (int j = 0; j <= k; j++) {
24            int r = k - j;
25            if (j <= L && r <= R) {
26                long combL = fact[L] * inv_fact[j] % MOD * inv_fact[L-j] % MOD;
27                long combR = fact[R] * inv_fact[r] % MOD * inv_fact[R-r] % MOD;
28                ans = (ans + combL * combR) % MOD;
29            }
30        }
31        
32        
33        return (int)(ans * 2 % MOD);
34    }
35    
36    private long modPow(long base, long exp, long mod) {
37        long result = 1;
38        base %= mod;
39        while (exp > 0) {
40            if ((exp & 1) == 1) result = result * base % mod;
41            base = base * base % mod;
42            exp >>= 1;
43        }
44        return result;
45    }
46}