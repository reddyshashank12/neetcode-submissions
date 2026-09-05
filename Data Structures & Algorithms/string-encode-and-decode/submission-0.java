class Solution {

   public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            result.append(s.length())
                  .append('#')
                  .append(s);
        }

        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(s.substring(i, j));

            // Move past '#'
            j++;

            // Extract string
            String word = s.substring(j, j + length);

            result.add(word);

            // Move to next encoded string
            i = j + length;
        }

        return result;
    }   
}
