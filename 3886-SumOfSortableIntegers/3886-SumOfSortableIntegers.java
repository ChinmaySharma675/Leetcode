// Last updated: 9/5/2026, 7:26:56 PM
class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] s = nums.clone();
        Arrays.sort(s);
        int res = 0;
        for (int k = 1; k <= n; k++)
            if (n % k == 0 && check(nums, s, k)) res += k;
        return res;
    }

    private boolean check(int[] a, int[] s, int k) {
        for (int i = 0; i < a.length; i += k) {
            int[] c = Arrays.copyOfRange(a, i, i + k);
            Arrays.sort(c);
            if (!Arrays.equals(c, Arrays.copyOfRange(s, i, i + k))) return false;
            int d = 0, pos = -1;
            
            for (int j = i; j < i + k - 1; j++) {
                if (a[j] > a[j + 1]) { d++; pos = j - i; }
            }
           
            if (d > 1 || (d == 1 && a[i + k - 1] > a[i])) return false;
        }
        return true;
    }
}