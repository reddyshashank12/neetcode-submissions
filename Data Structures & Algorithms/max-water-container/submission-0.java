class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;

        int start = 0; 
        int end = heights.length-1;
        while(start < end){
            int min = Math.min(heights[start],heights[end]);
            ans = Math.max(ans, (end-start) * min);

            if(heights[start]< heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}
