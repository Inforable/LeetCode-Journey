class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> setBanned = new HashSet<>();
        Collections.addAll(setBanned, bannedWords);

        int count = 0;
        for (String word : message) {
            if (setBanned.contains(word)) count++;

            if (count >= 2) return true;
        }
        return false;
    }
}