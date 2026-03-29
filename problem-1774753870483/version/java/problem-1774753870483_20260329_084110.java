// Last updated: 3/29/2026, 8:41:10 AM
1class Solution {
2
3    int[] parent, parity;
4
5    public int find(int x) {
6        if (parent[x] != x) {
7            int orig = parent[x];
8            parent[x] = find(parent[x]);
9            parity[x] ^= parity[orig]; 
10        }
11        return parent[x];
12    }
13
14    public int numberOfEdgesAdded(int n, int[][] edges) {
15
16        parent = new int[n];
17        parity = new int[n];
18
19        for (int i = 0; i < n; i++) {
20            parent[i] = i;
21            parity[i] = 0;
22        }
23
24        int count = 0;
25
26        for (int[] e : edges) {
27            int u = e[0], v = e[1], w = e[2];
28
29            int ru = find(u);
30            int rv = find(v);
31
32            if (ru != rv) {
33
34                parent[ru] = rv;
35
36                parity[ru] = parity[u] ^ parity[v] ^ w;
37
38                count++;
39            } else {
40                if ((parity[u] ^ parity[v] ^ w) == 0) {
41                    count++;
42                }
43            }
44        }
45
46        return count;
47    }
48}