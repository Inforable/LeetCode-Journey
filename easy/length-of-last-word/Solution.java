class Solution {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
}