class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> temp = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[j]+nums[i]);
                if(temp.contains(third)){
                    List<Integer> dup = new ArrayList<>();
                    dup.add(nums[i]);
                    dup.add(nums[j]);
                    dup.add(third);
                    Collections.sort(dup);
                    set.add(dup);
                }
                temp.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
    }
}
