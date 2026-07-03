class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       int n = nums.length;
       for(int idx = 0; idx < n; idx++){
            int pos = Math.abs(nums[idx]) - 1;
            if(nums[pos] > 0){
                nums[pos] = -nums[pos];
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                int value = i+1;
                ans.add(value);
            }
        }
        return ans;
    }
}
