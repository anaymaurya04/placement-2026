class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int k = n-1;
        int[] res = new int[n];
        while(l<=r){
            int left = nums[l]*nums[l];
            int right = nums[r]*nums[r];
            if(left>right){
                res[k] = left;
                l++;
            }
            else{
                res[k] = right;
                r--;
            }
            k--;
        }
        return res;
    }
}