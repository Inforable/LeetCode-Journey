class Solution {
    public int lengthOfLongestSubstring(String s) {
        int tail = 0;
        int head = 0;
        int len = s.length();
        int result = 0;
        HashSet<Character> set = new HashSet<>();

        while (head < len) {
            if (!set.contains(s.charAt(head))) {
                set.add(s.charAt(head));
                result = Math.max(result, head - tail + 1);
                head++;
            } else {
                set.remove(s.charAt(tail));
                tail++;
            }
        }

        return result;
    }
}