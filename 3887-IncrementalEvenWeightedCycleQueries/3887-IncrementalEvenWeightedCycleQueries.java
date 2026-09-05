// Last updated: 9/5/2026, 7:27:57 PM
class Solution {

    int[] parent, parity;

    public int find(int x) {
        if (parent[x] != x) {
            int orig = parent[x];
            parent[x] = find(parent[x]);
            parity[x] ^= parity[orig]; 
        }
        return parent[x];
    }

    public int numberOfEdgesAdded(int n, int[][] edges) {

        parent = new int[n];
        parity = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            parity[i] = 0;
        }

        int count = 0;

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            int ru = find(u);
            int rv = find(v);

            if (ru != rv) {

                parent[ru] = rv;

                parity[ru] = parity[u] ^ parity[v] ^ w;

                count++;
            } else {
                if ((parity[u] ^ parity[v] ^ w) == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}