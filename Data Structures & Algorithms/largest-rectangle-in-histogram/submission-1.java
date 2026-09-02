class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int top = stack.pop();
                int right = i;
                int left = stack.isEmpty()?-1:stack.peek();
                int temp = heights[top]*(right-left-1);
                max = Math.max(max,temp);
            }
                stack.push(i);
            
        }

        while(!stack.isEmpty()){
            int top = stack.pop();
            int right = n;
            int left = stack.isEmpty()?-1:stack.peek();
            int temp = heights[top]*(right-left-1);
            max = Math.max(max,temp);
        }
        return max;
    }
}
