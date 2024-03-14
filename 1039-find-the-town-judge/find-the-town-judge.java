class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        // Make one hashset and one array and keep a count of trust[0] = person who trusts
        // trust[1] = person trusted by everyone
        // Iterate both and see which person is trusted by everyone
        HashSet<Integer> trustsSomeone = new HashSet<>();
        int[] trustCounts = new int[n + 1]; // We use n + 1 because the labels are from 1 to n

        for (int[] pair : trust) {
            int person = pair[0];
            int trustedPerson = pair[1];
            
            trustsSomeone.add(person); // Record that this person trusts someone
            trustCounts[trustedPerson]++; // Increment the trust count for the trusted person
        }
        for(int i = 0; i <= n; i++){
            // Now the town judge SHOULD NOT BE in the trusts someone
            // and he should have appeared n - 1 times in the array (1,2,3) 1 is townjudge so 2 is not
            if(!trustsSomeone.contains(i) && trustCounts[i] == n-1){
                return i;
            }
        }
        return -1;
        
    }
}