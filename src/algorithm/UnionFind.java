package algorithm;

public class UnionFind {
    int[] parents;
    int count;

    UnionFind(int n) {
        parents = new int[n];
        for (int i = 0; i < n; i++)
            parents[i] = i;
        count = n;
    }

    int find(int x) {
        while (parents[x] != x) {
            parents[x] = parents[parents[x]];
            x = parents[x];
        }
        return x;
    }

    boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parents[rootA] = rootB;
            count--;
            return true;
        } else {
            return false;
        }
    }
}
