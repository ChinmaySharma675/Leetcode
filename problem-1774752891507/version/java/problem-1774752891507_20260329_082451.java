// Last updated: 3/29/2026, 8:24:51 AM
1class Solution {
2    public int sortableIntegers(int[] nums) {
3        int n = nums.length;
4        int[] s = nums.clone();
5        Arrays.sort(s);
6        int res = 0;
7        for (int k = 1; k <= n; k++)
8            if (n % k == 0 && check(nums, s, k)) res += k;
9        return res;
10    }
11
12    private boolean check(int[] a, int[] s, int k) {
13        for (int i = 0; i < a.length; i += k) {
14            int[] c = Arrays.copyOfRange(a, i, i + k);
15            Arrays.sort(c);
16            if (!Arrays.equals(c, Arrays.copyOfRange(s, i, i + k))) return false;
17            int d = 0, pos = -1;
18            
19            for (int j = i; j < i + k - 1; j++) {
20                if (a[j] > a[j + 1]) { d++; pos = j - i; }
21            }
22           
23            if (d > 1 || (d == 1 && a[i + k - 1] > a[i])) return false;
24        }
25        return true;
26    }
27}