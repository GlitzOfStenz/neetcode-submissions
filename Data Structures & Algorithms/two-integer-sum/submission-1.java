class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{i,map.get(diff)};
            }
        }
        return new int[]{0};
        // int first = -1;
        // int sec = -1;
        // boolean flag = false;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int sum = nums[i]+nums[j];
        //         if(sum==target){
        //             first = i;
        //             sec = j;
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         break;
        //     }
        // }
        // return new int[]{first,sec};
    }
}
