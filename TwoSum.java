import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int balance;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            balance = target - nums[i];
            if (map.containsKey(balance)) {
                return new int[]{map.get(balance),i}; 
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}