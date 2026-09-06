class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();

        while(end < s.length()){
            char ch = s.charAt(end);
            if(map.containsKey(ch) && start <= map.get(ch)){
                start=map.get(ch)+1;
            }

            map.put(ch,end);
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return (ans == Integer.MIN_VALUE)? 0 : ans;
    }
}