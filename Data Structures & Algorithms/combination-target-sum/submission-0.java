class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        recur(nums,target,0,res,list);

    return res;
    }


    public void recur(int[] nums, int target, int cur, List<List<Integer>> res, List<Integer> list){

        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        if(cur == nums.length || target < 0){
            return;
        }

        list.add(nums[cur]);
        recur(nums,target-nums[cur],cur,res,list);
        list.remove(list.size()-1);


        recur(nums,target,cur+1,res,list);
    }
}
