class Solution {
    public int pivotInteger(int n) {
        int p = 0;
        int s = 0;

        for (int i = 1; i <= n; i++) {
            if (prefixSum(0, i) == suffixSum(i, n)) {
                return i;
            }
        }

        return -1;
    }

    private int prefixSum(int y, int z) {
        int p = 0;
        for (int i = y; i <= z; i++) {
            p = p + i;
        }
        return p;
    }

    private int suffixSum(int k, int l) {
        int s = 0;
        for (int i = k; i <= l; i++) {
            s = s + i;
        }
        return s;
    }
}
