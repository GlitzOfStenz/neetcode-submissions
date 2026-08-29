class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int first = -1;
        int sec = -1;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    first = i;
                    sec = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return new int[]{first,sec};
    }
}
