class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                result.pop();
            } else if (s.equals("D")) {
                result.push(result.peek() * 2);
            } else if (s.equals("+")) {
                int top = result.pop();
                int newTop = top + result.peek();
                result.push(top);
                result.push(newTop);
            } else {
                result.push(Integer.parseInt(s));
            }
        }

        int output = 0;
        while (!result.isEmpty()) {
            output += result.pop();
        }
        return output;
    }
}
