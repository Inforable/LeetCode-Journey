class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleaned.isEmpty()) return true;

        String reversed = new StringBuilder(cleaned).reverse().toString().toLowerCase();

        return cleaned.equals(reversed);
    }
}