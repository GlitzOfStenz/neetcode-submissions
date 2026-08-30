class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] freq = new ArrayList[n+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int c = entry.getKey();
            int count = entry.getValue();
            if(freq[count]==null){
                freq[count]= new ArrayList<>();
            }
            freq[count].add(c);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]!=null){
                for(int val:freq[i]){
                ans[idx++] = val;
                if(idx==k)return ans;
            }
            }
        }
        return ans;
    }
}
