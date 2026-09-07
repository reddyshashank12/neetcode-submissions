class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = -1;
        int start = 1;
        int end = 0;
        for(int i = 0; i < piles.length; i++){
            end = Math.max(end,piles[i]);
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(mid,piles,h)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
    return ans;
    }

    public boolean isPossible(int mid, int[] piles, int h){
        int hourSpent = 0;
        for(int i = 0; i < piles.length; i++){
            hourSpent += piles[i] / mid;
            if(piles[i] % mid != 0){
                hourSpent++;
            }

            if(hourSpent > h){
                return false;
            }
        }
    return true;
    }
}