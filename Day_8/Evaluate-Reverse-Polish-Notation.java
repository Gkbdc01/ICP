            } else if (c.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(c));
                stack.push(stack.pop() + stack.pop());
            if (c.equals("+")) {

        for (String c : tokens) {
        Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
class Solution {