class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Loop to pick the first number
        for (int i = 0; i < nums.length; i++){
            // Loop to pick the second number after the first
            for (int j = i + 1; j < nums.length; j++) {
                // If both numbers add up to target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // If no pair found, return empty array
        return new int[] {};
    }
}