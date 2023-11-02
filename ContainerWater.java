class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while (l < r) {
            int area = ((r+1) - (l+1)) * Math.min(height[l],height[r]);
            if (area > maxArea) {
                maxArea = area;
            } 
            if (height[l] < height[r]) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }
        return maxArea;
    }
}