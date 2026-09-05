class Solution {
     public int longestConsecutive(int[] nums) {
        int ans =0;
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            map.put(nums[i] , false);
        }
        for(int i = 0;i< nums.length; i++){
            int nextnum = nums[i]+1;
            int cur = 1;

            while(map.containsKey(nextnum) && map.get(nextnum) == false){
                cur++;
                map.put(nextnum,true);
                nextnum++;
                
            }
            int prevnum = nums[i]-1;
            while(map.containsKey(prevnum) && map.get(prevnum) == false){
                cur++;
                map.put(prevnum,true);
                prevnum--;
            }
        ans = Math.max(ans,cur);
        }
        return ans;
    }
}
