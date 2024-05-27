class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            int currArea=Math.min(height[left], height[right]) * (right-left);
            area=Math.max(area, currArea);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
