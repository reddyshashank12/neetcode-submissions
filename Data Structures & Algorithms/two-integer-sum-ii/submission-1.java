class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] ans = new int[2];
        int ans1 = 1;
        int ans2 = -1;
        while(start < end){
            if(numbers[start]+numbers[end] == target){
                ans1 = start;
                ans2 = end;
                // ans[0] = numbers[ans1];
                // ans[1] = numbers[ans2];
                ans[0] = ans1+1;
                ans[1] = ans2+1;
                return ans;
            }
            else if(target > numbers[start]+numbers[end]){
                start++;
            }
            else {
                end--;
            }
        }

        return ans;
    }
}
