class Solution {
  public String minWindow(String s, String t) {

    if (t.length() > s.length()) {
        return "";
    }

    Map<Character, Integer> need = new HashMap<>();
    Map<Character, Integer> window = new HashMap<>();

    // Build frequency map for t
    for (char c : t.toCharArray()) {
        need.put(c, need.getOrDefault(c, 0) + 1);
    }

    int have = 0;
    int needCount = need.size();

    int left = 0;

    int minLength = Integer.MAX_VALUE;
    int minLeft = 0;

    for (int right = 0; right < s.length(); right++) {

        char c = s.charAt(right);

        // Add character to window
        window.put(c, window.getOrDefault(c, 0) + 1);

        // This character just satisfied its required frequency
        if (need.containsKey(c)
                && window.get(c).intValue() == need.get(c).intValue()) {
            have++;
        }

        // Window is valid
        while (have == needCount) {

            // Update minimum window
            if (right - left + 1 < minLength) {
                minLength = right - left + 1;
                minLeft = left;
            }

            // Remove left character
            char leftChar = s.charAt(left);

            if (need.containsKey(leftChar)
                    && window.get(leftChar).intValue()
                    == need.get(leftChar).intValue()) {
                have--;
            }

            window.put(leftChar, window.get(leftChar) - 1);

            left++;
        }
    }

    if (minLength == Integer.MAX_VALUE) {
        return "";
    }

    return s.substring(minLeft, minLeft + minLength);
}
}
