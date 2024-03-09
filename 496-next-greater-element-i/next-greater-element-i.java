class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            result[i] = checkGreater(nums1[i], nums2);
        }

        return result;
    }

    public int checkGreater(int x, int[] nums2) {
        boolean found = false;
        for(int i = 0; i < nums2.length; i++) {
            if(found && nums2[i] > x) {
                return nums2[i];
            }
            if(nums2[i] == x) {
                found = true;
            }
        }
        return -1;
    }
}
