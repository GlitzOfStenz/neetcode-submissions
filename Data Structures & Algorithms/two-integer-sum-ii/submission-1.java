class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = numbers[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left][0]+arr[right][0];
            if(sum==target){
                return new int[]{arr[left][1]+1,arr[right][1]+1};
            }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
