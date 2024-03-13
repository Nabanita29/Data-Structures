class Solution {
    public int pivotInteger(int n) {
        int[] prefs = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            prefs[i] = prefs[i - 1] + i;
        }

        for (int i = 1; i < n + 1; i++) {
            if (prefs[i] == prefs[n] - prefs[i - 1])
                return i;
        }

        return -1;
    }
}