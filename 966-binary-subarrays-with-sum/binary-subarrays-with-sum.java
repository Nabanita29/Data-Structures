class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // My initial method was too calculate prefix and suffix sum using calling methods
        // We can do the same using hashmap

        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> PrefixSum = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            PrefixSum.put(sum, PrefixSum.getOrDefault(sum,0)+1);
            sum = sum + nums[i];
            count = count + PrefixSum.getOrDefault(sum - goal, 0);
        }
        return count;
    }
}