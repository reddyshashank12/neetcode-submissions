class Solution {
 
    public List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> ans = new HashSet<>();

     Arrays.sort(nums);
    int n = nums.length;
     for(int i = 0; i < n-2; i++){
        int left = i+1;
        int right = n-1;

        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(nums[i] + nums[left] + nums[right] == 0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            else if(sum < 0){
                left++;
            }
            else{
                right--;
            }
        }
     }   

     return new ArrayList<>(ans);
    }

}
