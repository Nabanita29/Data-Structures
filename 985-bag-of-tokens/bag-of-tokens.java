class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxScore = 0;
        boolean faceup = true;
        boolean facedown = true;

        Arrays.sort(tokens); // Sort tokens to ensure we play the highest value tokens first

        int left = 0, right = tokens.length - 1;

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                maxScore = Math.max(maxScore, score);
                left++; // Move the left pointer after updating the score
            } else if (score > 0) {
                power += tokens[right];
                score--;
                right--; // Move the right pointer after using token for face-down play
            } else {
                break; // No more moves possible
            }
        }

        return maxScore;
    }
}
