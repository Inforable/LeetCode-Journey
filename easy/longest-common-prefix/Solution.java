class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }

        int minLength = strs[0].length();
        int numOfString = strs.length;

        for (int i = 0; i < numOfString; i++) {
            int currentLength = strs[i].length();
            if (currentLength == 0) {
                return result;
            }
            if (currentLength < minLength) {
                minLength = currentLength;
            }
        }

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < numOfString; j++) {
                if (currentChar != strs[j].charAt(i)) {
                    return result;
                }
            }
            result += currentChar;
        }
        return result;
    }
}