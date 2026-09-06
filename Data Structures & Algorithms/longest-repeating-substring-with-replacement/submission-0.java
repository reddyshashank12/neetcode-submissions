class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int start = 0;
        int maxcount= 0;
        int maxlen = 0;
        int[] count = new int[26];
        for(int end =0;end <n;end++ ){
                count[s.charAt(end) - 'A'] ++;
                int currentcount = count[s.charAt(end) -'A'];
                maxcount = Math.max(maxcount , currentcount);
                
            while(end-start-maxcount+1 >k){
                count[s.charAt(start)-'A']--;
                start++;
            }
             maxlen = Math.max(maxlen,end-start+1);
        }
       
        return maxlen; 
    }
}