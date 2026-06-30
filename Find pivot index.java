class Solution {
    public int findSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int totalSum = findSum(nums);
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            else{
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
