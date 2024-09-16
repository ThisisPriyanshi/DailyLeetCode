class Solution {
    public int maxArea(int[] height) {
      Stack<Integer> st = new Stack<>();
        int n = height.length;
        for(int i=0; i<n; i++){
            if(st.isEmpty() || height[st.peek()]<=height[i]){
                st.push(i);
            }
        }
        int maxArea = Integer.MIN_VALUE;
        while(!st.isEmpty()){
            int index = st.pop();
            for(int j=n-1; j>index; j--){
                int area = Math.min(height[index], height[j])*(j-index);
                maxArea = Math.max(area, maxArea);
                if(height[j]>=height[index]){
                    break;
                }
            }
        }
        return maxArea;
    }
}