class Solution {
    private boolean helper(String s, int start, int end) {
    // Template with base case and recursive function you want implemented
        if(start > end) return true;
        if(s.charAt(start) != s.charAt(end))
            return false;
        return helper(s, start + 1, end - 1);
        

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        return helper(s, 0, s.length() - 1);
    }
}


        
