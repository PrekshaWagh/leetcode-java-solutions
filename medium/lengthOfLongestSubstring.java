class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // ASCII character
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1; //Initialize all to -1
        }

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);

            // If character already appeared, move start
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }

            // Update last seen index of the character
            lastIndex[currentChar] = end;

            // Update max length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}