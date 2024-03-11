import java.util.Arrays;

class Solution {
    public String customSortString(String order, String s) {
        int[] frequency = new int[256]; // Assuming ASCII characters
        
        // Count the frequency of characters in s
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }
        
        StringBuilder result = new StringBuilder();
        
        // Append characters according to the order string
        for (char c : order.toCharArray()) {
            while (frequency[c] > 0) {
                result.append(c);
                frequency[c]--;
            }
        }
        
        // Append remaining characters not present in the order string
        for (char c = 'a'; c <= 'z'; c++) { // Assuming lowercase letters
            while (frequency[c] > 0) {
                result.append(c);
                frequency[c]--;
            }
        }
        
        return result.toString();
    }
}
