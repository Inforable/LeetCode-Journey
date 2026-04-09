import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
            if (map.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();

                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
       return stack.isEmpty();
    }
}