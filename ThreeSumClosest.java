import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n-2;i++){
            int f = i;
            int l = f+1;
            int r = n-1;
            int sum;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
                sum = nums[f] + nums[l] + nums[r];
                if (sum == target) return target;
                if(Math.abs(target-sum)<Math.abs(target - closest)){
                    closest = sum;
                }
                if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return closest;
    }
}