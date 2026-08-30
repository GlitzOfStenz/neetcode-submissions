class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(set.contains(it-1)){
                continue;
            }
            else{
                int val = it;
                int count = 1;
                while(true){
                    if(set.contains(val+1)){
                        count++;
                        val++;
                    }
                    else{
                        break;
                    }
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
