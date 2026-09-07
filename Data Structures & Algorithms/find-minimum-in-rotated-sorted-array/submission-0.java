class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid>0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            // check if the right side is sorted and if it is sorted move the end to mid-1
            else if(nums[mid] < nums[end]){
                end = mid-1;
            }
            // if the right side is not sorted move the start to mid+1
            else{
                start = mid+1;
            }
        }
        return nums[start];
    }
}