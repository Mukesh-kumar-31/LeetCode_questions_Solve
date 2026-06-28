class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            int flag = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                list.add(i);
            }
        }
        return list;
    }
}
