class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m){
            return false;
        }

        int end = n-1;
        int start = 0;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0 ;i < n; i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        
        while(end < m){
            if(Arrays.equals(a,b)){
                return true;
            }
            else{
                b[s2.charAt(start)-'a']--;
                start++;
                end++;
                if(end < m){

                b[s2.charAt(end)-'a']++;
                }
            }
        }
        return false;
    }
}